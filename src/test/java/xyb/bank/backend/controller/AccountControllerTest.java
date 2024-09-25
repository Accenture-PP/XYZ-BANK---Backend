package xyb.bank.backend.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
public class AccountControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAccountInfo() throws Exception {
        mockMvc.perform(get("/account/info"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Amit Raut"))
                .andExpect(jsonPath("$.address").value("Dallas, Texas, USA"))
                .andExpect(jsonPath("$.email").value("amit.raut@xyzbank.com"))
                .andExpect(jsonPath("$.accountType").value("Checking"))
                .andExpect(jsonPath("$.balance").value(9876.54));
    }
}
