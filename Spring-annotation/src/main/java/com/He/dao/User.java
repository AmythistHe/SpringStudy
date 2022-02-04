package com.He.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/4 17:54
 */
// @Component注解等价于在beans.xml文件中配置bean
@Repository
@Scope("singleton")
public class User {
    @Value("001")
    private String name;
    @Value("20")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
