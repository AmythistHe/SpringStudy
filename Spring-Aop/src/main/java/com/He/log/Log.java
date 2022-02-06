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
     * ִ��ǰ��־
     * @param method Ҫִ��Ŀ�����ķ���
     * @param args ����
     * @param target Ŀ�����
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() +
                "��" + method.getName() + "��ִ����");
    }
}
