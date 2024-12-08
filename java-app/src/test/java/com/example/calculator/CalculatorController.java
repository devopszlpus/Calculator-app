package com.example.calculatorapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public String add(@RequestParam int num1, @RequestParam int num2) {
        int sum = num1 + num2;
        return "Sum: " + sum;
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam int num1, @RequestParam int num2) {
        int difference = num1 - num2;
        return "Difference: " + difference;
    }
}
