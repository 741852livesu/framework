package com.live.springmvc.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.ServletRequestHandledEvent;

/**
 * @Description: 每次HTTP请求完成的监听事件
 * @author: sulh
 * @date: 2021年07月09日 14:33
 * @version: 1.0
 */
@Component
public class ServletRequestHandleListener implements ApplicationListener<ServletRequestHandledEvent> {
    /**
     * @version： v1.0
     * @author:  sulh
     * @date:    2021/7/9 14:47
     * @return: 
     * @description:
     * ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
     * HttpServletRequest request = servletRequestAttributes.getRequest();
     * HttpServletResponse response = servletRequestAttributes.getResponse();
     */
    
    @Override
    public void onApplicationEvent(ServletRequestHandledEvent event) {
        System.out.println("请求完成。。。"+event.getDescription());
    }
}
