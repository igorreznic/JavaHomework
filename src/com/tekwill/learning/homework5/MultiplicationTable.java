package com.tekwill.learning.homework5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number and the range for it:");
        int number = scanner.nextInt();
        int range = scanner.nextInt();

        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }

    }
}
