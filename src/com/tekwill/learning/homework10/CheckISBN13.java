package com.tekwill.learning.homework10;

import java.util.Scanner;

public class CheckISBN13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of a ISBN-13 as a string:");
        String isbnInput = scanner.next();
        int lastDigit = 10 - (isbnInput.charAt(0) + isbnInput.charAt(2) + isbnInput.charAt(4) + isbnInput.charAt(6) + isbnInput.charAt(8) + isbnInput.charAt(10) +
                3 * (isbnInput.charAt(1) + isbnInput.charAt(3) + isbnInput.charAt(5) + isbnInput.charAt(7) + isbnInput.charAt(9) + isbnInput.charAt(11))) % 10;
        if (lastDigit == 10) {
            lastDigit = 0;
        }
        if (isbnInput.length() > 12)
            System.out.println("The input is longer than 12 digits. The result is based on first 12 digits.");
        System.out.println("The ISBN-13 number is: " + isbnInput.substring(0, 12).concat(Integer.toString(lastDigit)));
    }
}
