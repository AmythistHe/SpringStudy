package com.He.dao;

import com.He.pojo.Student;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/8 17:40
 */
public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentDao {
    @Override
    public List<Student> selectStudent() {
        return getSqlSession().getMapper(StudentDao.class).selectStudent();
    }

    @Override
    public int addStudent(Student student) {
        return getSqlSession().getMapper(StudentDao.class).addStudent(student);
    }

    @Override
    public int deleteStudent(int id) {
        return getSqlSession().getMapper(StudentDao.class).deleteStudent(id);
    }

    @Override
    public int updateStudent(int id, float score) {
        return getSqlSession().getMapper(StudentDao.class).updateStudent(id, score);
    }
}
