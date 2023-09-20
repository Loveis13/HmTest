package com.lepexoff.calculator.service;

import com.lepexoff.calculator.exception.DivideException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    private int num1 = 5;
    private int num2 = 2;

    @Test
    void plus_shouldReturnPositiveNum1andNum2ArePositive() {// 1 + 2  5 (-6)

        long result = calculatorService.plus(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @Test
    void plus_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2BiggerTheNum1() {

        num2 = -6;
        long result = calculatorService.plus(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @Test
    void divide_shouldReturnPositiveNum1andNum2ArePositive() {
        double result = calculatorService.divide(num1, num2);
        assertEquals((double) num1 / num2, result);

    }

    @Test
    void divide_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2BiggerTheNum1() {
        num2 = -5;
        double result = calculatorService.divide(num1, num2);
        assertEquals((double) num1 / num2, result);
    }

    @Test
    void divide_shouldThrowExceptionWhenNum2Is0() {
        num2 = 0;
        DivideException result = assertThrows(DivideException.class, () ->
                calculatorService.divide(num1, num2));
        assertEquals("Деление на 0 не доступно", result.getMessage());

    }

    @Test
    void minus_shouldReturnPositiveNum1andNum2ArePositive() {

        long result = calculatorService.minus(num1, num2);
        assertEquals(num1 - num2, result);
    }

    @Test
    void minus_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2BiggerTheNum1() {
        num2 = + 6;
        long result = calculatorService.minus(num1, num2);
        assertEquals(num1 - num2, result);

    }

    @Test
    void multiply_shouldReturnPositiveNum1andNum2ArePositive() {

        long result = calculatorService.multiply(num1,num2);
        assertEquals(num1 * num2,result);
    }

    @Test
    void multiply_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2BiggerTheNum1() {
        long result = calculatorService.multiply(num1,num2);
        assertEquals(num1 * num2,result);
    }


}