package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class TaxedAmount {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount:");
        float amount = scanner.nextFloat();
        System.out.printf("Amount with 5%% tax: $%.2f", amount * 1.05);
    }
}
