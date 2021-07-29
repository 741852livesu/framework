package com.live.springmvc.contronller.paramenterresolver;

import com.live.springmvc.annotation.CurrentUserName;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.Principal;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年07月26日 14:52
 * @version: 1.0
 */
@Slf4j
@RestController
public class ParamenterResolverController {

    @GetMapping("/hello")
    public String hello(@CurrentUserName String name) {
        return "hello " + name;
    }


    @GetMapping("/hello2")
    public String hello2(Principal principal) {
        String name = "Principal  hello " + principal;
        System.out.println(name);
        return name;
    }

    @PostMapping("/hello3")
    public void hello3(@RequestParam MultiValueMap map) throws IOException {
        //省略...
    }

}
