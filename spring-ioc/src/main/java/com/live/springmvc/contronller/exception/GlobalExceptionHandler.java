package com.live.springmvc.contronller.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.batch.BatchDataSource;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年04月01日 9:53
 * @version: 1.0
 */

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * @version： v1.0
     * @author:  sulh
     * @date:    2021/4/1 10:26
     * @return:
     * @description:全局异常处理
     */
    @ExceptionHandler(Exception.class)
    public void exceptionHandlerMethon(HttpServletRequest request, HttpServletResponse response, Exception ex) throws IOException {
        log.info("全局异常生效,请求："+request.getRequestURI());
        ex.printStackTrace();
        response.sendError(404,"请求异常!");
    }
    /**
     * @version： v1.0
     * @author:  sulh
     * @date:    2021/4/1 10:29
     * @return:
     * @description: Controller 接口全局参数绑定  demo   #com.live.contronller.ioc.StudentController.hello#
     */
    @ModelAttribute(name = "globalAttribute")
    public Map<String,Object> mydata() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("age", 99);
        map.put("gender", "BOY");
        return map;
    }


}
