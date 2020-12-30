package com.tekwill.learning.flowcontrol.loops;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter:");
        char letterRaw = scanner.next().charAt(0);
        char letter = Character.toLowerCase(letterRaw);
        List<Character> alphabet = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        int n = 0;
        for (char element : alphabet) {
            n++;
            if (letter == element) {
                if (1 <= n && n <= 3) {
                    System.out.println("The corresponding number is 2");
                } else if (4 <= n && n <= 6) {
                    System.out.println("The corresponding number is 3");
                } else if (7 <= n && n <= 9) {
                    System.out.println("The corresponding number is 4");
                } else if (10 <= n && n <= 12) {
                    System.out.println("The corresponding number is 5");
                } else if (13 <= n && n <= 15) {
                    System.out.println("The corresponding number is 6");
                } else if (16 <= n && n <= 19) {
                    System.out.println("The corresponding number is 7");
                } else if (20 <= n && n <= 22) {
                    System.out.println("The corresponding number is 8");
                } else if (23 <= n && n <= 26) {
                    System.out.println("The corresponding number is 9");
                }
                break;
            } else if (n == 26) {
                System.out.println("Invalid input");

            }

        }

    }
}
