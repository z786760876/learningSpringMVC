package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @controlLer:创建处理器对象,对象放在sprinamvc容器中 位置:在类的上面
 * 和spring中讲的@service ,@component
 * <p>
 * 能处理请求的都是控制器（处理器):MyController能处理请求，
 * 叫做后端控制器（back controller)
 */
@Controller
public class MyController {
    /**
     * 处理用户提交的请求，springmvc中是使用方法来处理的。
     * 方法是自定义的,可以有多种返回值，多种参数，方法名称自定义
     */

    /**
     * 准备使用dosome方法处理some.do请求。
     *
     * @RequestMapping:请求映射，作用是把一个请求地址和一个方法绑定在一起。 一个请求指定一个方法处理。
     * 属性:1.value是一个string，表示请求的uri地址的( some.do ) 。
     * vaLue的值必须是唯一的，不能重复。在使用时，推荐地址以"s/”
     * 位置:1.在方法的上面，常用的。
     * 2.在类的上面
     * <p>
     * 说明:使用RequestMapping修饰的方法叫做处理器方法或者控制器方法。
     * 使用@RequestMapping修饰的方法可以处理请求的，类似servlet中的doGet,doPost
     * <p>
     * 返回值: ModelAndView表示本次请求的处理结果
     * Model:数据，请求处理完成后，要显示给用户的数据
     * View:视图，比如jsp等等。
     */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome() {   // doGet()--service请求处理
        // 处理some.do请求了。相当于service调用处理完成了。
        ModelAndView mv = new ModelAndView();
        // 添加数据，框架在请求的最后把数据放入到request作用域。
        // request.setAttribute( "msg", "欢迎使用springmvc做web开发");
        mv.addObject("msg", "欢迎使用springmvc做web开发");
        mv.addObject("fun", "执行的是dosome方法");

        // 指定视图，指定视图的完整路径
        // 框架对视图执行的forward操作,request.getRequestDispather("/show.jsp).forward(...)
        // mv.setViewName("/show.jsp");
        // mv.setViewName("WEB-INF/view/show.jsp");

        //当配置了视图解析器后，可以使用逻辑名称(文件名）,指定视图
        //框架会使用视图解析器的前缀＋逻辑名称＋后缀组成完成路径，这里就是字符连接操作
        // WEB-INF/view/ + show + .jsp
        mv.setViewName("show");

        // 返回mv
        return mv;
    }
}
