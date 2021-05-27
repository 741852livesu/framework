package com.live.contronller.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年04月01日 9:53
 * @version: 1.0
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionNextHandler {
    /*/**
     * @version： v1.0
     * @author:  sulh
     * @date:    2021/4/1 10:26
     * @return:
     * @description:全局异常处理
     */
    @ExceptionHandler(Exception.class)
    public void exceptionHandlerMethon(HttpServletRequest request, Exception ex) {
        log.info("全局异常Next生效。。。"+ex.getMessage());
    }
    /*/**
     * @version： v1.0
     * @author:  sulh
     * @date:    2021/4/1 10:29
     * @return:
     * @description: Controller 接口全局参数绑定  demo   #com.live.contronller.ioc.StudentController.hello#
     */
    @ModelAttribute(name = "globalNextAttribute")
    public Map<String,Object> mydata() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("age", 99);
        map.put("gender", "BOY");
        return map;
    }


}
