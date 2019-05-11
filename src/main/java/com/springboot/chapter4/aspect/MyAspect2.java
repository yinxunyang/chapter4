package com.springboot.chapter4.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
public class MyAspect2 {
    @Pointcut("execution( * com.springboot.chapter4.aspect.service.impl.UserServiceImpl.manyAspects(..))")
    public void mayAspects() {
    }

    @Before("mayAspects()")
    public void beforeParam(JoinPoint point) {
        System.out.println("Before2......");
    }

    @After("mayAspects()")
    public void After() {
        System.out.println("After2......");
    }

    @AfterReturning("mayAspects()")
    public void AfterReturning() {
        System.out.println("AfterReturning2......");
    }

}
