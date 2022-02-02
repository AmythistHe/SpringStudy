package com.He.service;

import com.He.dao.UserDao;
import com.He.dao.UserDaoImpl;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/2 11:29
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    @Override
    public void getUser() {
        userDao.getUser();
    }
    // 使用set动态完成值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
