package com.live.contronller;

import com.live.entity.School;
import com.live.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class StudentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);


    @Autowired
    private School school;

    int number=123;

    @GetMapping("/method")
    @ResponseBody
    public Student get() {
        LOGGER.info("GET TEST success...");
        return new Student();
    }

    @GetMapping("/test1")
    @ResponseBody
    public Student test1() {
        System.out.println("execute test...");
        return new Student();
    }
    @GetMapping("/test2")
    @ResponseBody
    public Student test2() {
        System.out.println("execute test...");
        return new Student();
    }
}
