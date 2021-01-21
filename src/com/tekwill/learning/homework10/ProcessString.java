package com.tekwill.learning.homework10;

import java.util.Scanner;

public class ProcessString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Characters at odd positions: ");
        for (int i = 0; i < input.length(); i += 2) {
            System.out.print(input.charAt(i));
        }
    }
}
