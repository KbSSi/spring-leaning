package com.ioc.xml.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author KangWenBin
 * @description
 * @date 2023/7/29
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-factoryBean.xml");

        User user = (User) context.getBean("user");

    }
}
