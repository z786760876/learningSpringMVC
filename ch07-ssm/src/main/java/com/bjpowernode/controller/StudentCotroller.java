package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentCotroller extends HttpServlet {

    @Resource
    private StudentService service;

    //注册学生
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student) {
        ModelAndView modelAndView = new ModelAndView();

        String tips = "注册失败";
        //调用service处理student
        int nums = service.addStudent(student);
        if (nums > 0) {
            tips = "学生【" + student.getName() + "】注册成功";
        }

        //添加数据
        modelAndView.addObject("tips", tips);
        //指定结果页面
        modelAndView.setViewName("result");

        return modelAndView;
    }

    //处理查询,响应ajax
    @RequestMapping("/queryStudent.do")
    @ResponseBody
    public List<Student> queryStudent(Student student) {
        //参数检查，简单的数据处理
        List<Student> students = service.findStudents();
        return students;
    }

}
