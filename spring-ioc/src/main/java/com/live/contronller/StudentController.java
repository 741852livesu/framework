package com.live.contronller;

import com.live.entity.School;
import com.live.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class StudentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);


    @Autowired
    private School school;


    @GetMapping("/method")
    @ResponseBody
    public Student get() {
        ServletRequestAttributes stt = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        stt.getResponse();
        /**随时获取request AND response */
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        // HttpServletResponse response = servletRequestAttributes.getResponse();
        return new Student();
    }

    @GetMapping("/test1")
    @ResponseBody
    public Student test1(HttpServletRequest request) {
        LocaleContextHolder.getLocaleContext();
        System.out.println("execute test...");
        return new Student();
    }

    @GetMapping("/last2")
    @ResponseBody
    public Student last2() {
        System.out.println("execute test...");
        return new Student();
    }

    @GetMapping("/nonMatch")
    @ResponseBody
    public Student nonMatch() {
        System.out.println("execute test...");
        return new Student();
    }
}
