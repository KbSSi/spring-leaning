package com.ioc.xml.diSpecialTypeValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpList {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-diList.xml");

        Dept dept = context.getBean("dept", Dept.class);

        dept.info();
    }
}
