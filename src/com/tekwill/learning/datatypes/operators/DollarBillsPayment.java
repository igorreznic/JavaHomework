package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class DollarBillsPayment {
    public static int Count$20Bills(int amount) {
        return amount / 20;
    }

    public static int CountRemaining$10Bills(int amount) {
        return (amount % 20) / 10;
    }

    public static int CountRemaining$5Bills(int amount) {
        return ((amount % 20) % 10) / 5;
    }

    public static int CountRemaining$1Bills(int amount) {
        return ((amount % 20) % 10) % 5;
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Dollar amount:");
        int amount = scanner.nextInt();
        System.out.println("$20 Bills: " + Count$20Bills(amount) +
                "\n$10 Bills: " + CountRemaining$10Bills(amount) +
                "\n $5 Bills: " + CountRemaining$5Bills(amount) +
                "\n $1 Bills: " + CountRemaining$1Bills(amount));

    }
}
