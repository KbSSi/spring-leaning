package com.ioc.xml.life;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author KangWenBin
 * @description
 * @date 2023/7/29
 */
public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean-life.xml");

        User user = context.getBean("user", User.class);
        System.out.println("6 bean对象创建完成，可以使用");
        System.out.println(user);

        context.close();//销毁bean对象
    }
}
