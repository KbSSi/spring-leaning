package com.priv.aop.example;

/**
 * @author KangWenBin
 * @description 静态代理，可以将业务代理与日志功能解耦，但是日志功能还不能统一，需要用到动态代理进行解决
 * @date 2023/7/31
 */
public class CalculatorStaticProxy implements Calculator{

    //被代理对象传递过来
    private Calculator calculator;
    public CalculatorStaticProxy(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
        //输入日志
        System.out.println("输出的数字为：" + i + " " + j);

        //核心业务逻辑
        int result = calculator.add(i, j);

        //输出日志
        System.out.println("输出的结果为：" + result);

        return result;
    }
}
