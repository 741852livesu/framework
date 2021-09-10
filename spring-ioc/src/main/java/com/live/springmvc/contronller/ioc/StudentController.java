package com.live.springmvc.contronller.ioc;

import com.live.springmvc.entity.School;
import com.live.springmvc.entity.Student;
import com.live.springmvc.service.imp.Cat;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/test")
@SessionAttributes("name")
@Slf4j
public class StudentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);


        @Autowired
    private School studentControllerSchool;


    private String name = "fvv";

    @Autowired
    Cat cat;


    @GetMapping("/method1")
    @ResponseBody
    public Student getmethod() {

        cat.eat();

        return new Student();
    }

    private void getTotle(int i,ObjectFactory tt ) {

        log.info(String.valueOf(tt.getObject()));

    }

    @GetMapping("/test1")
    @ResponseBody
    public Student test1(HttpServletRequest request) {
        LocaleContextHolder.getLocaleContext();
        System.out.println("execute test...");
        Map.class.isAssignableFrom(Map.class);
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
    public void nonMatch() {
        throw new RuntimeException("nonMatch");
    }

    @GetMapping("/hello")
    @ModelAttribute
    public void getHello(Model model) {
        Map<String, Object> map = model.asMap();
        System.out.println(map);

    }

    /*/**
     * @version： v1.0
     * @author:  sulh
     * @date:    2021/4/7 8:49
     * @return:
     * @description:
     */
    @GetMapping("/sessionAttribute")
    public void sessionAttribute(@SessionAttribute("name") String model) {
        System.out.println(model);

    }

    /*/**
     * @version： v1.0
     * @author:  sulh
     * @date:    2021/4/7 8:49
     * @return:
     * @description:使用了 @SessionAttributes 注解之后，可以调用 SessionStatus.setComplete 方法来清除数据，
     */
    @GetMapping("/sessionStatus")
    public void sessionAttribute(SessionStatus sessionStatus) {
        //这个方法只是清除 SessionAttribute 里的参数，而不会清除正常 Session 中的参数。
        sessionStatus.setComplete();
    }

    public int sum(int i,int j) {
        log.info(String.valueOf(i+j));
        return i+j;
    }

}
