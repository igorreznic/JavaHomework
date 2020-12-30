package com.tekwill.learning.flowcontrol.homework;

import java.util.Scanner;

public class VowelOrConsonantDetector {

    static boolean isVowel(char letter) {
        switch (letter) {
            case 'a':
            case 'e':
            case 'y':
            case 'u':
            case 'i':
            case 'o':
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter grade");
        char letterRaw = scanner.next().charAt(0);
        char letter = Character.toLowerCase(letterRaw);
        if (isVowel(letter)) {
            System.out.println(letterRaw + " is a vowel");
        } else if (!isVowel(letter)) {
            if ('b' <= letter && letter <= 'z') {
                System.out.println(letterRaw + " is a consonant");
            } else {
                System.out.println(letterRaw + " is an invalid input");
            }
        }
    }
}
