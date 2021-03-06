package com.bjpowernode.controller;

import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.MyUserException;
import com.bjpowernode.exception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {

    @RequestMapping(value = "/doSome.do")
    public ModelAndView doRedirect(String name, Integer age) throws MyUserException {

        ModelAndView mv = new ModelAndView();

        //根据请求参数抛出异常
        if (!"zs".equals(name)) {
            throw new NameException("姓名不正确!!!");
        }
        if (age==null||age>80) {
            throw new AgeException("年龄比较大!!!");
        }

        mv.addObject("myname", name);
        mv.addObject("myage", age);

        //重定向
        mv.setViewName("show");
        return mv;
    }

}
