package xyb.bank.backend.service.impl;

import org.springframework.stereotype.Service;
import xyb.bank.backend.model.Account;
import xyb.bank.backend.model.Portfolio;
import xyb.bank.backend.service.PortfolioService;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    @Override
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
