package com.live.common.proxy.java.dynamic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

/**
 * @Description:  两定机构结算支付失败处理
 * @author: sulh
 * @date: 2021年08月12日 11:08
 * @version: 1.0
 */



@Slf4j
@Service
public class AdminServiceInvocation implements InvocationHandler {

    private Object target;
    public AdminServiceInvocation(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("判断用户是否有权限进行操作");
        Object obj = method.invoke(target);
        log.info("记录用户执行操作的用户信息、更改内容和时间等");
        return obj;
    }

}