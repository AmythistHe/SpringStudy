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
     * ִ�к���־
     * @param returnValue ����ֵ
     * @param method
     * @param args
     * @param target
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("ִ����" + method.getName() +
                "������ ���ؽ��Ϊ��" + returnValue);
    }
}
