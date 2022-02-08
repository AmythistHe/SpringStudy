package com.He.pojo;

import lombok.Data;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/8 17:05
 */
@Data
public class Student {
    private int id;
    private String name;
    private float score;

    public Student(int id, String name, float score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
}
