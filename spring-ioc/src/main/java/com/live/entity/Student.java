package com.live.entity;

import com.live.contronller.ioc.StudentController;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
@ToString
public class Student {

    @Autowired
    StudentController schoolStudentController;

    String name;
    int age;

}
