package com.live.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@Component
@ToString
public class Student {

    String name;
    int age;

}
