package com.via.skillsoft.junit;

public class AccountDetails {

    private String name;
    private Double accountNumber;
    private Integer customerId;
    private Double balance;
    private String accountType;

    public AccountDetails(String name, double accountNumber, int customerId,
            double balance, String accountType) {
        super();
        this.name = name;
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
    }

    public boolean withdraw(double withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("Insufficient Funds");
            return false;
        } else {
            balance = balance - withdrawAmount;
            return true;
        }

    }

}
