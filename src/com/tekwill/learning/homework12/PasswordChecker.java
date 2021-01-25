package com.tekwill.learning.homework12;

import java.util.Scanner;

public class PasswordChecker {
    static int minLength = 8;
    static int minNumberOfDigits = 2;
    static int currentNumberOfDigits;
    static boolean isLetter;


    static void isValid(String password) {
        if (password.length() >= minLength) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isLetter(password.charAt(i)) && !isLetter) {
                    isLetter = true;
                } else if (Character.isDigit(password.charAt(i)) && currentNumberOfDigits < minNumberOfDigits) {
                    currentNumberOfDigits++;
                }
            }
        }

        if (isLetter && currentNumberOfDigits == minNumberOfDigits) {
            System.out.println("Is Valid");
        } else System.out.println("Is Invalid");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password");
        String password = scanner.nextLine();
        isValid(password);
    }
}
