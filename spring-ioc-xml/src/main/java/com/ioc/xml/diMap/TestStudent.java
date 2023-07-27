package com.ioc.xml.diMap;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    @Test
    public void teststudent(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-diMap.xml");
        Student student = context.getBean("student", Student.class);

        student.run();
    }
}
