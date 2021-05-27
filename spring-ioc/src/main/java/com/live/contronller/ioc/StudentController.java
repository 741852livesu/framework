package com.live.contronller.ioc;

import com.live.entity.School;
import com.live.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void nonMatch() {
        throw new RuntimeException("nonMatch");
    }

    @GetMapping("/hello")
    @ModelAttribute
    public void hello(Model model) {
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

}
