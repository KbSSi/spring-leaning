package com.ioc.xml.diSpecialTypeValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-diSpecialTypeValue.xml");

        Emp emp = context.getBean("emp3", Emp.class);
        emp.work();
    }
}
