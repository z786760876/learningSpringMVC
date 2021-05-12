package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @RequestMapping value :所有请求地址的公共部分，叫做模块名称
 * 位置:放在类的上面
 */
@Controller
public class MyController {

    /**
     * 处理器方法返回string--表示逻辑视图名称,需要配置视图解析器
     */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(HttpServletRequest request, String name, Integer age) {
        System.out.println("doReturnview, name=" + name + " age=" + age);

        ModelAndView mv = new ModelAndView();
        mv.addObject("myname", name);
        mv.addObject("myage", age);
        mv.setViewName("show");

        // request.getRequestDispatcher("/show.jsp");

        return mv;
    }

}
