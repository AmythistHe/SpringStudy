package com.He.dao;

import com.He.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/8 17:38
 */
public interface StudentDao {
    public List<Student> selectStudent();

    public int addStudent(Student student);

    public int deleteStudent(@Param("id") int id);

    public int updateStudent(@Param("id") int id, @Param("score") float score);
}
