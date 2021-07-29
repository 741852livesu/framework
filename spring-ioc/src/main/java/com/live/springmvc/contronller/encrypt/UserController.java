package com.live.springmvc.contronller.encrypt;

import com.live.springmvc.annotation.Decrypt;
import com.live.springmvc.annotation.Encrypt;
import com.live.springmvc.entity.User;
import com.live.springmvc.utils.RespBean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年07月21日 14:57
 * @version: 1.0
 */
@RestController
public class UserController {

    @GetMapping("/user")
    @Encrypt
    public RespBean getUser(Model model) {
        User user = new User();
        user.setId("88");
        user.setUsername("javaboy");
        return RespBean.ok("ok", user);
    }

    @PostMapping("/user")
    public RespBean addUser(@RequestBody @Decrypt User user) {
        System.out.println("user = " + user);
        return RespBean.ok("ok", user);
    }
}