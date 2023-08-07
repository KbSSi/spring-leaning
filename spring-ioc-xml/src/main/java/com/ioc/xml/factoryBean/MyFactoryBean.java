package com.ioc.xml.factoryBean;

import com.ioc.xml.life.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author KangWenBin
 * @description
 * @date 2023/7/29
 */
public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
