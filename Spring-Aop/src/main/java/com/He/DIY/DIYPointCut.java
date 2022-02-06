package com.He.DIY;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/6 11:49
 */
public class DIYPointCut {
    
    public void before() {
        System.out.println("方法执行前");
    }

    public void after() {
        System.out.println("方法执行后");
    }
}
