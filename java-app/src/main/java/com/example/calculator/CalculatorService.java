package com.example.calculator;

public class CalculatorService {

    private Calculator calculator;

    public CalculatorService() {
        this.calculator = new Calculator();
    }

    public int add(int a, int b) {
        return calculator.add(a, b);
    }

    public int subtract(int a, int b) {
        return calculator.subtract(a, b);
    }

    public int multiply(int a, int b) {
        return calculator.multiply(a, b);
    }

    public double divide(int a, int b) {
        return calculator.divide(a, b);
    }
}
