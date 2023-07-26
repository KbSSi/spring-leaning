package com.ioc.xml.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    @Test
    public void testProperity() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean-di.xml");
        Book book = (Book)context.getBean("book", Book.class);

        System.out.println(book);
    }

    @Test
    public void testCon(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean-di.xml");
        Book book = (Book)context.getBean("bookCon", Book.class);

        System.out.println(book);
    }
}
