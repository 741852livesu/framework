package com.live.springmvc.entity;


import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
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