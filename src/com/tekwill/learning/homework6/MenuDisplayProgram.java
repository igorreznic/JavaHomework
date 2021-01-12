package com.tekwill.learning.homework6;

import java.util.Scanner;

public class MenuDisplayProgram {
    public static void main(String[] args) {
        boolean wrongAnswer = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select Your choice:\n" +
                "  e) Scrambled egg        f) French Toast\n" +
                "  p) Pancakes             w) Waffles");
        char choice = scanner.next().charAt(0);

        while (choice != 'e' && choice != 'f' && choice != 'p' && choice != 'w') {
            System.out.println("Try to enter [e], [f], [p] or [w].");
            choice = scanner.next().charAt(0);
        }
        //wrongAnswer = false;
        switch (choice) {
            case 'e':
                System.out.println("Excellent choice!!!");
                break;
            case 'f':
                System.out.println("French Toast - that's good!!!");
                break;
            case 'p':
                System.out.println("Pancakes - that's delicious!!!");
                break;
            case 'w':
                System.out.println("Crunchy-y-y-y !!!");

        }
    }
}
