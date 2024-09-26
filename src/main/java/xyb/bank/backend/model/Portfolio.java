package xyb.bank.backend.model;

public class Portfolio {
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
