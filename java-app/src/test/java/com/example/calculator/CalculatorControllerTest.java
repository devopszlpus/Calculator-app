package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(CalculatorController.class)  // Specifies the controller to test
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;  // Mock MVC to perform HTTP requests

    @Test
    public void testAddition() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/add")
                .param("num1", "5")
                .param("num2", "3"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Sum: 8"));
    }

    @Test
    public void testSubtraction() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/subtract")
                .param("num1", "5")
                .param("num2", "3"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Difference: 2"));
    }
}
