package com.tekwill.learning.homework18;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance / 100 * getMonthlyInterestRate();
    }

    public void withdraw(double withdrawAmount) {
        balance = balance - withdrawAmount;
        System.out.println("Withdraw: " + withdrawAmount + "$, Your remaining balance is: " + balance + "$");
    }

    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
        System.out.println("Deposit: " + depositAmount + "$, Your new balance is: " + balance + "$");
    }

}
