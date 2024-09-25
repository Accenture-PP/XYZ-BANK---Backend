package xyb.bank.backend.model;

public class Account {
    private String name;
    private String address;
    private String email;
    private String accountType;
    private double balance;

    public Account(String name, String address, String email, String accountType, double balance) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.accountType = accountType;
        this.balance = balance;
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

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    // Optionally, you can add setters here if needed
}
