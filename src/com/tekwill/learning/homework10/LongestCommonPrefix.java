package com.tekwill.learning.homework10;

import java.util.Scanner;

public class LongestCommonPrefix {
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:");
        String firstInput = scanner.nextLine();
        System.out.println("Enter second string:");
        String secondInput = scanner.nextLine();
        int minLength = firstInput.length();
        if (firstInput.length() > secondInput.length()) minLength = secondInput.length();

        for (int i = 0; i < minLength; i++) {
            if (firstInput.charAt(i) == secondInput.charAt(i)) {
                n += 1;
            } else {
                if (n == 0) System.out.println("There is no common prefix.");
                break;
            }
        }
        if (n != 0) System.out.println("The common prefix is: " + firstInput.substring(0, n));
    }
}
