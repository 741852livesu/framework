package com.live.entity;


import com.live.contronller.StudentController;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Data
@Component
@ToString
public class School {
    @Autowired
    private Student student;
    private String name;
    private String address;


}