package com.ioc.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {

        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean.xml");

        //1、根据id获取bean
        User user = (User) context.getBean("user");
        System.out.println(user);

        //2、 根据类型来获取bean
        User user1 = context.getBean(User.class);
        System.out.println(user1);

        //根据id和类型
        User user2 = context.getBean("user", User.class);
        System.out.println(user2);
    }

}
