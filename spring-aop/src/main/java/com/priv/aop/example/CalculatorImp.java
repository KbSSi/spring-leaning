package com.priv.aop.example;

/**
 * @author KangWenBin
 * @description
 * @date 2023/7/31
 */
public class CalculatorImp implements Calculator{
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }
}
