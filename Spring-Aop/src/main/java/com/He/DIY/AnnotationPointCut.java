package com.He.DIY;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/6 12:14
 */
// 使用注解实现AOP
@Component // 注册bean
@Aspect // 标注切面类
public class AnnotationPointCut {
    @Before("execution(* com.He.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行前");
    }
    
    @After("execution(* com.He.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("方法执行后");
    }

    // @Around可以给定切入点参数
    @Around("execution(* com.He.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        // 执行方法
        Object proceed = jp.proceed();
        System.out.println("环绕后");
    }
}
