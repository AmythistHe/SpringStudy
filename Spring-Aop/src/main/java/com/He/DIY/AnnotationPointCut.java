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
// ʹ��ע��ʵ��AOP
@Component // ע��bean
@Aspect // ��ע������
public class AnnotationPointCut {
    @Before("execution(* com.He.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("����ִ��ǰ");
    }
    
    @After("execution(* com.He.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("����ִ�к�");
    }

    // @Around���Ը�����������
    @Around("execution(* com.He.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("����ǰ");
        // ִ�з���
        Object proceed = jp.proceed();
        System.out.println("���ƺ�");
    }
}
