package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAddition() throws Exception {
        // Ensure that you are passing 'num1' and 'num2' parameters
        mockMvc.perform(MockMvcRequestBuilders.get("/add")
                .param("num1", "5")  // This corresponds to the parameter in the controller
                .param("num2", "3")) // This corresponds to the parameter in the controller
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Sum: 8"));
    }

    @Test
    public void testSubtraction() throws Exception {
        // Ensure that you are passing 'num1' and 'num2' parameters
        mockMvc.perform(MockMvcRequestBuilders.get("/subtract")
                .param("num1", "5")  // This corresponds to the parameter in the controller
                .param("num2", "3")) // This corresponds to the parameter in the controller
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Difference: 2"));
    }
}
