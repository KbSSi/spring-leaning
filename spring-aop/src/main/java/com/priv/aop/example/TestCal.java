package com.priv.aop.example;

/**
 * @author KangWenBin
 * @description
 * @date 2023/8/6
 */
public class TestCal {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImp());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 2);
    }
}
