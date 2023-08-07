package com.ioc.xml.auto.service;

import com.ioc.xml.auto.dao.UserDao;

/**
 * @author KangWenBin
 * @description
 * @date 2023/7/29
 */
public class UserServiceImp implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("Service方法...");
        userDao.addUserDao();
    }
}
