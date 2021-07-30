package com.live.springmvc.compent;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AspectTwo {

    @AfterThrowing(throwing ="ex",pointcut="execution(* *.last*(..))")
    public void AfterThrowing(Exception ex) {

    }
}
