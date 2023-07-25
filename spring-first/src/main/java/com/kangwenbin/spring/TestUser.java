package com.kangwenbin.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUserObject(){
        //加载spring配置文件，创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //获取创建的对象
        User user = (User)context.getBean("user");
        System.out.println(user);

        //使用对象调用方法进行测试
        user.add();
    }

    @Test
    public void testUserobject1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class aClass = Class.forName("com.kangwenbin.spring.User");

        User user = (User)aClass.newInstance();

        user.add();
    }
}
