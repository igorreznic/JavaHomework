package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class DollarBillsPayment {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Dollar amount:");
        int amount = scanner.nextInt();
        System.out.println("$20 Bills: " + amount / 20 +
                "\n$10 Bills: " + (amount % 20) / 10 +
                "\n $5 Bills: " + ((amount % 20) % 10) / 5 +
                "\n $1 Bills: " + ((amount % 20) % 10) % 5);
    }
}
