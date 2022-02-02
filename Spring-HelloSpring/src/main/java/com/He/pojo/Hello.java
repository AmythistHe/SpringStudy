package com.He.pojo;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/2 14:31
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
