package xyb.bank.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyb.bank.backend.model.Account;

@RestController
@RequestMapping("/portfolio")
public class PortfolioController {

    @GetMapping("/details")
    public Portfolio getPortfolioDetails() {
        // Assuming you're pulling this data from AccountController in a real scenario
        Account accountInfo = new Account("Amit Raut", "Dallas, Texas, USA", "amit.raut@xyzbank.com", "Checking", 9876.54);

        return new Portfolio(
            accountInfo.getName(),
            accountInfo.getAddress(),
            accountInfo.getEmail(),
            accountInfo.getBalance(), // Corrected method call
            accountInfo.getAccountType(), // Corrected order of parameters
            12000.00, // Sample savings balance
            "XYB Bank",
            new String[]{"Stocks", "Bonds", "Real Estate"} // Sample portfolio items
        );
    }

    // Inner class to hold portfolio information
    static class Portfolio {
        private String name;
        private String address;
        private String email;
        private double balance;
        private String checkingAccountName;
        private double savingsBalance;
        private String bankName;
        private String[] investments;

        public Portfolio(String name, String address, String email, double balance, String checkingAccountName, double savingsBalance, String bankName, String[] investments) {
            this.name = name;
            this.address = address;
            this.email = email;
            this.balance = balance;
            this.checkingAccountName = checkingAccountName;
            this.savingsBalance = savingsBalance;
            this.bankName = bankName;
            this.investments = investments;
        }

        // Getters
        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getEmail() {
            return email;
        }

        public double getBalance() {
            return balance;
        }

        public String getCheckingAccountName() {
            return checkingAccountName;
        }

        public double getSavingsBalance() {
            return savingsBalance;
        }

        public String getBankName() {
            return bankName;
        }

        public String[] getInvestments() {
            return investments;
        }
    }
}
