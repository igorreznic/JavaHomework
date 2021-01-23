package com.tekwill.learning.homework11;

import java.util.Scanner;

public class VowelsAndConsonantsCounter {
    static int vowelsNumber;
    static int consonantsNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        //char[] vowelsList = new char[]{'A', 'E', 'I', 'Y', 'U','O'};
        //char[] consonantsList = new char[] {'B', 'C', 'D' .....};
        String vowelsList = "AEYUIO";
        String consonantsList = "BCDFGHJKLMNPQRSTVWXZ";

        for (int i = 0; i < input.length(); i++) {

            if (vowelsList.contains(String.valueOf(Character.toUpperCase(input.charAt(i))))) {
                vowelsNumber++;
            } else if (consonantsList.contains(String.valueOf(Character.toUpperCase(input.charAt(i))))) {
                consonantsNumber++;
            } else {
            }
        }
        System.out.println("The number of vowels in the string: " + vowelsNumber);
        System.out.println("The number of consonants in the string: " + consonantsNumber);
    }
}
