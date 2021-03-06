package com.He.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/6 11:23
 */
public class AfterLog implements AfterReturningAdvice {
    /**
     * 执行后日志
     * @param returnValue 返回值
     * @param method
     * @param args
     * @param target
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() +
                "方法， 返回结果为：" + returnValue);
    }
}
