package com.ioc.xml.auto.dao;

import com.ioc.xml.auto.service.UserService;

/**
 * @author KangWenBin
 * @description
 * @date 2023/7/29
 */
public class UserDaoImp implements UserDao {
    @Override
    public void addUserDao() {
        System.out.println("Dao执行了...");
    }
}
