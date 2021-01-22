package com.tekwill.learning.homework10;

public class CheckISBN13 {
    private static int sum;

    public static int checkISBN(String isbn) {
        int lastDigit;
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                sum += isbn.charAt(i);
            } else sum += 3 * isbn.charAt(i);
        }
        if ((10 - sum % 10) == 10) lastDigit = 0;
        else lastDigit = 10 - sum % 10;
        return lastDigit;

    }

//    public static int checkISBN13(String isbn) {
//        int lastDigit = 10 - (isbn.charAt(0) + isbn.charAt(2) + isbn.charAt(4) + isbn.charAt(6) + isbn.charAt(8) + isbn.charAt(10) +
//                3 * (isbn.charAt(1) + isbn.charAt(3) + isbn.charAt(5) + isbn.charAt(7) + isbn.charAt(9) + isbn.charAt(11))) % 10;
//        if (lastDigit == 10) {
//            lastDigit = 0;
//        }
//        return lastDigit;
//    }


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first 12 digits of a ISBN-13 as a string:");
//        String isbnInput = scanner.next();
//
//        if (isbnInput.length() > 12)
//            System.out.println("The input is longer than 12 digits. The result is based on first 12 digits.");
//
//        System.out.println("The ISBN-13 number is: " + isbnInput.substring(0, 12).concat(Integer.toString(checkISBN(isbnInput))));
        System.out.println(0 % 2);
    }
}
