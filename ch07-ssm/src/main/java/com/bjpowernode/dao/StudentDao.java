package com.bjpowernode.dao;


import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentDao {

    Integer insertStudents(Student student);

    List<Student> selectStudents();
}
