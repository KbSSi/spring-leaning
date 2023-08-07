package com.ioc.xml.auto;

import com.ioc.xml.auto.controller.UserController;
import com.ioc.xml.auto.service.UserServiceImp;
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
                new ClassPathXmlApplicationContext("beanAuto.xml");

        UserController userController = (UserController) context.getBean("userController");

        userController.addUser();
    }
}
