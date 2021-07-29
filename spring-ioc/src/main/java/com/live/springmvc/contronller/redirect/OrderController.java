package com.live.springmvc.contronller.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: flashmap  重定向传递参数
 * @author: sulh
 * @date: 2021年07月15日 15:07
 * @version: 1.0
 */
@Controller
public class OrderController {
    /*
     *flashmap  重定向传递参数
     */
    @PostMapping("/order")
    public String order(HttpServletRequest req) {
        FlashMap flashMap = (FlashMap) req.getAttribute(DispatcherServlet.OUTPUT_FLASH_MAP_ATTRIBUTE);
        flashMap.put("name", "江南一点雨");
        return "redirect:/orderlist";
    }

    @GetMapping("/orderlist")
    public String orderList(Model model) {
        System.out.println("orderlist:"+model.getAttribute("name"));
        return (String) model.getAttribute("name");
    }

    @PostMapping("/orderRedirectAttributes")
    public String order(RedirectAttributes attr) {
        attr.addFlashAttribute("site", "www.javaboy.org");
        attr.addAttribute("name", "微信公众号：江南一点雨");
        return "redirect:/orderlistRedirectAttributes";
    }

    @GetMapping("/orderlistRedirectAttributes")
    @ResponseBody
    public String orderListRedirectAttributes(Model model) {
        System.out.println("orderlistRedirectAttributes:"+model.getAttribute("site"));
        return (String) model.getAttribute("site");
    }
}