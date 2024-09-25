package xyb.bank.backend.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

@WebMvcTest(PortfolioController.class)  // WebMvcTest specifically for PortfolioController
public class PortfolioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetPortfolioDetails() throws Exception {
        mockMvc.perform(get("/portfolio/details"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(jsonPath("$.name", is("Amit Raut")))
            .andExpect(jsonPath("$.address", is("Dallas, Texas, USA")))
            .andExpect(jsonPath("$.email", is("amit.raut@xyzbank.com")))
            .andExpect(jsonPath("$.balance", is(9876.54)))
            .andExpect(jsonPath("$.checkingAccountName", is("Checking")))
            .andExpect(jsonPath("$.savingsBalance", is(12000.00)))
            .andExpect(jsonPath("$.bankName", is("XYB Bank")))
            .andExpect(jsonPath("$.investments", containsInAnyOrder("Stocks", "Bonds", "Real Estate")));
    }
}
