package com.live.springmvc.compent;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AspectOne {

    @Pointcut(value = "execution(* *.test*())")
    public void cut() {
    }




    @Before(value = "cut()")
    public void before() {

    }

    @After(value = "cut()")
    public void After() {

    }
}
