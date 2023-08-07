package com.ioc.xml.auto.controller;

import com.ioc.xml.auto.service.UserService;

/**
 * @author KangWenBin
 * @description
 * @date 2023/7/29
 */
public class UserController {
    private UserService userService;

    public void setUserService(UserService userService){
        this.userService = userService;
    }
    public void addUser(){
        System.out.println("controller方法执行了");
        userService.addUserService();
    }
}
