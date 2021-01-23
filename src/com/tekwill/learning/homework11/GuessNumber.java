package com.tekwill.learning.homework11;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static boolean guessed;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int pickedNumber = random.nextInt(100);
        System.out.println("Guess the number:");

        while (!guessed) {
            int guessingNumber = scanner.nextInt();
            if (guessingNumber > pickedNumber) {
                System.out.println("Too high. Try again.");
            } else if (guessingNumber < pickedNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.printf("You got it, the number is %d.", pickedNumber);
                guessed = true;
            }
        }
    }
}
