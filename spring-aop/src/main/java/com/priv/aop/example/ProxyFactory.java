package com.priv.aop.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author KangWenBin
 * @description 动态代理类
 * @date 2023/8/6
 */
public class ProxyFactory {
    //目标对象
    private Object target;
    public ProxyFactory(Object target){
        this.target = target;
    }

    //返回代理对象
    public Object getProxy(){
        /**
         * Proxy.newProxyInstanc()方法
         * 三个参数：
         * 第一个参数：ClassLoader: 加载动态生成代理类的类加载器
         * 第二个参数：Class[] interfaces: 目标对象实现的所有接口
         * 第三个参数：InvocationHandler: 设置代理对象实现目标对象方法的过程
         */

        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                //方法调用前输出
                System.out.println("[动态代理][日志]" + method.getName());

                //调用目标的方法
                Object result = method.invoke(target, args);
                System.out.println(result);
                //方法调用后输出
                System.out.println("[动态代理][日志]" + method.getName());

                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
