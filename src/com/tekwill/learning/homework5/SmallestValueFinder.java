package com.tekwill.learning.homework5;

import java.util.Scanner;

public class SmallestValueFinder {
    public static void main(String[] args) {
        System.out.println("Enter a list of integers, firstly enter how many integers will be in the list and then the integers itself (all delimited by spaces):");
        Scanner scanner = new Scanner(System.in);
        int numberOfIntegers = scanner.nextInt();
        int smallestInteger = scanner.nextInt();


        for (int i = 1; i < numberOfIntegers; i++) {
            int number = scanner.nextInt();
            if (smallestInteger > number) {
                smallestInteger = number;
            }

        }
        System.out.println("Smallest integer is: " + smallestInteger);
    }
}
