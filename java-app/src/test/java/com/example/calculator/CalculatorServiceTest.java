package com.example.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(10, service.add(4, 6));
    }

    @Test
    void testSubtract() {
        assertEquals(3, service.subtract(7, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(12, service.multiply(3, 4));
    }

    @Test
    void testDivide() {
        assertEquals(4.0, service.divide(8, 2));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> service.divide(5, 0));
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
