package com.tekwill.learning.homework12;

import java.util.Scanner;

public class RomanNumeralConverter {
    static int integer;
    static boolean correctInput = true;

    static void convertRomanNumerals(String roman) {
        for (int i = 0; i < roman.length(); i++) {
            if (correctInput) {
                if ((i + 1 < roman.length())) {
                    if (roman.charAt(i) == 'I' && (roman.charAt(i + 1) == 'V' || roman.charAt(i + 1) == 'X')) {
                        integer -= 2;
                    } else if (roman.charAt(i) == 'X' && (roman.charAt(i + 1) == 'L' || roman.charAt(i + 1) == 'C')) {
                        integer -= 20;
                    } else if (roman.charAt(i) == 'C' && (roman.charAt(i + 1) == 'D' || roman.charAt(i + 1) == 'M')) {
                        integer -= 200;
                    } else {
                    }
                }

                switch (roman.charAt(i)) {
                    case 'I':
                        integer += 1;
                        break;
                    case 'V':
                        integer += 5;
                        break;
                    case 'X':
                        integer += 10;
                        break;
                    case 'L':
                        integer += 50;
                        break;
                    case 'C':
                        integer += 100;
                        break;
                    case 'D':
                        integer += 500;
                        break;
                    case 'M':
                        integer += 1000;
                        break;
                }

                if (roman.charAt(i) != 'I' && roman.charAt(i) != 'V' && roman.charAt(i) != 'X' && roman.charAt(i) != 'L' &&
                        roman.charAt(i) != 'C' && roman.charAt(i) != 'D' && roman.charAt(i) != 'M') {

                    System.out.println("Wrong input!!!!");
                    correctInput = false;
                }
            }
        }
        if (correctInput)
            System.out.println(integer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a roman numeral:");
        String input = scanner.next();
        convertRomanNumerals(input);

    }
}
