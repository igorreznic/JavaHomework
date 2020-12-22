package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class LoanBalanceCalculator {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of loan: ");
        float loanAmount = scanner.nextFloat();
        System.out.println("Enter interest rate: ");
        float interestRate = scanner.nextFloat();
        System.out.println("Enter monthly payment: ");
        float monthlyPayment = scanner.nextFloat();

        float firstMonthInterest = loanAmount * interestRate / 100 / 12;
        float after1stPaymentBalance = loanAmount - monthlyPayment + firstMonthInterest;

        float SecondMonthInterest = after1stPaymentBalance * interestRate / 100 / 12;
        float after2ndPaymentBalance = after1stPaymentBalance - monthlyPayment + SecondMonthInterest;

        float thirdMonthInterest = after2ndPaymentBalance * interestRate / 100 / 12;
        float after3rdPaymentBalance = after2ndPaymentBalance - monthlyPayment + thirdMonthInterest;

        System.out.printf("Balance after 1st payment: $%.2f\n", after1stPaymentBalance);
        System.out.printf("Balance after 2nd payment: $%.2f\n", after2ndPaymentBalance);
        System.out.printf("Balance after 3rd payment: $%.2f\n", after3rdPaymentBalance);
    }
}
