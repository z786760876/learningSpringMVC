package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {

    @RequestMapping(value = "/doSome.do")
    public ModelAndView doRedirect(String name, Integer age) {
        System.out.println("=====执行Mycontroller中的dosome方法=====");

        ModelAndView mv = new ModelAndView();

        mv.addObject("myname", name);
        mv.addObject("myage", age);

        //重定向
        mv.setViewName("show");
        return mv;
    }

}
