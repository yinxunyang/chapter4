package com.springboot.chapter4.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @Pointcut("execution( * com.springboot.chapter4.aspect.service.impl.UserServiceImpl.printUser(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before() {
        System.out.println("before......");
    }

    @After("pointcut()")
    public void After() {
        System.out.println("After......");
    }

    @AfterReturning("pointcut()")
    public void AfterReturning() {
        System.out.println("AfterReturning......");
    }

    @AfterThrowing("pointcut()")
    public void AfterThrowing() {
        System.out.println("AfterThrowing......");
    }
}
