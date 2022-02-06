package com.He.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/6 10:50
 */
public class Log implements MethodBeforeAdvice {

    /**
     * 执行前日志
     * @param method 要执行目标对象的方法
     * @param args 参数
     * @param target 目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() +
                "的" + method.getName() + "被执行了");
    }
}
