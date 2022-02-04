package com.He.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/3 19:00
 */
public class People {

    @Autowired
    private Cat cat;
    // @Qualifier�����ֶ�ָ��@Autowired�Զ�װ��bean��id
    @Autowired
    @Qualifier(value = "dog")
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
