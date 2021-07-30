package com.live.contronller.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年07月12日 15:56
 * @version: 1.0
 */
@Controller
@SessionAttributes("name")
public class HelloController {
    @GetMapping("/01")
    public String hello(Model model) {
        model.addAttribute("name", "javaboy");
        return "forward:/04";
    }

    @GetMapping("/04")
    @ResponseBody
    public void hello4(@SessionAttribute("name") String name) {
        System.out.println("name = " + name);
    }

    @GetMapping("/05")
    @ResponseBody
    public void hello5(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
    }
}