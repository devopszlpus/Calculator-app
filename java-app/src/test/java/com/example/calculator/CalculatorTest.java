package com.example.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
