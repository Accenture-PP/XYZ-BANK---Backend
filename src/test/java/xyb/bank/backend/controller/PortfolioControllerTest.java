package xyb.bank.backend.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import xyb.bank.backend.model.Portfolio;
import xyb.bank.backend.service.PortfolioService;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

@WebMvcTest(PortfolioController.class)
public class PortfolioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PortfolioService portfolioService;

    @Test
    public void testGetPortfolioDetails() throws Exception {
        Portfolio mockPortfolio = new Portfolio(
            "Amit Raut",
            "Dallas, Texas, USA",
            "amit.raut@xyzbank.com",
            9876.54,
            "Checking",
            12000.00,
            "XYB Bank",
            new String[]{"Stocks", "Bonds", "Real Estate"}
        );

        when(portfolioService.getPortfolioDetails()).thenReturn(mockPortfolio);

        mockMvc.perform(get("/portfolio/details"))
            .andExpect(status().isOk())
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
