package com.He.mapper;

import com.He.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/6 22:14
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
    @Override
    public List<User> selectUser() {
//        SqlSession sqlSession = getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        return mapper.selectUser();
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
