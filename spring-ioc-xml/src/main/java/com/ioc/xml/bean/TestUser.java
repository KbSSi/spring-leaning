package com.ioc.xml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        //通过接口找对象，如果一个接口有多个实现类，这些类都配置了bean，
        // 则根据接口类型找不到bean

        UserDao userdao = context.getBean(UserDao.class);
        System.out.println(userdao); //com.ioc.xml.bean.UserDaoImpl@4c550889
    }
}
