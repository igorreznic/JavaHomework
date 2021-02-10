package com.tekwill.learning.homework15;

import java.util.Scanner;

public class OccurrenceCounter {
    public static int currentNumber;
    public static int occurred;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        String[] numbers = scanner.nextLine().split(" ");
        int[] intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i < intNumbers.length; i++) {
            currentNumber = intNumbers[i];
            occurred = 1;
            for (int j = i + 1; j < intNumbers.length; j++) {
                if (intNumbers[j] == currentNumber && currentNumber != 0) {
                    occurred++;
                    intNumbers[i] = 0;
                }
            }
            if (currentNumber != 0) {
                System.out.println("Number " + currentNumber + ", occurred " + occurred + " times.");
            }
        }


    }
}
