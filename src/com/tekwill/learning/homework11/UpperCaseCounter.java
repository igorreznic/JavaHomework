package com.tekwill.learning.homework11;

import java.util.Scanner;

public class UpperCaseCounter {
    public static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                n += 1;
            }
        }
        if (n > 0)
            System.out.printf("There are %d uppercase letters.", n);
        else
            System.out.println("There are no uppercase letters");
    }
}
