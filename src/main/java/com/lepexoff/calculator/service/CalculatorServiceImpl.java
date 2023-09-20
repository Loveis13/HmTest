package com.lepexoff.calculator.service;

import com.lepexoff.calculator.exception.DivideException;
import org.springframework.stereotype.Service;

@Service

public class CalculatorServiceImpl implements CalculatorService {
    private int num1;
    private int num2;

    @Override
    public String hello() {
        return " Добро пожаловать в калькулятор ";
    }

    @Override
    public long plus(int num1, int num2) {

        return (long) num1 + num2;
    }

    @Override
    public long minus(int num1, int num2) {
        return (long)  num1 - num2;
    }

    @Override
    public long multiply(int num1, int num2) {

        return (long)  num1 * num2;
    }

    @Override
    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivideException(" Деление на 0 не доступно ");
        }
        double result = (double) num1 / num2;

        return result;
    }

}
