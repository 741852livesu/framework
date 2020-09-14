package com.live.contronller;

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
public class StudentContronller {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentContronller.class);


    @Autowired
    private Student student;

    @GetMapping("/method")
    @ResponseBody
    public Student get() {
        student.setAge(18);
        student.setName("BB");
        LOGGER.info("GET TEST success...");
        return student;
    }
}
