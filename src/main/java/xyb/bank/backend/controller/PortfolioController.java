package xyb.bank.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyb.bank.backend.model.Account;
import xyb.bank.backend.model.Portfolio;

@CrossOrigin(origins = "http://localhost:3000") 
@RestController
@RequestMapping("/portfolio")
public class PortfolioController {

    @GetMapping("/details")
    public Portfolio getPortfolioDetails() {
    
        Account accountInfo = new Account("Amit Raut", "Dallas, Texas, USA", "amit.raut@xyzbank.com", "Checking", 9876.54);

        return new Portfolio(
            accountInfo.getName(),
            accountInfo.getAddress(),
            accountInfo.getEmail(),
            accountInfo.getBalance(),
            accountInfo.getAccountType(),
            12000.00, 
            "XYB Bank",
            new String[]{"Stocks", "Bonds", "Real Estate"} 
        );
    }
}
