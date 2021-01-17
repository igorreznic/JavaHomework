package com.tekwill.learning.homework8;

import java.util.Random;
import java.util.Scanner;

public class EspGame {
    public static String color;
    public static int guessed;
    public static int repeat;

    public static String getUserAnswer() {
        System.out.println((repeat + 1) + ". Pick a color from: Red, Green, Blue, Orange and Yellow.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    public static String checkComputerChoice(int computerChoice) {
        switch (computerChoice) {
            case 0:
                color = "Red";
                break;
            case 1:
                color = "Green";
                break;
            case 2:
                color = "Blue";
                break;
            case 3:
                color = "Orange";
                break;
            case 4:
                color = "Yellow";
        }
        System.out.println("Computer choice was: " + color);
        return color;
    }

    public static void checkIfGuessed(String userGuess, String color) {
        if (userGuess.equalsIgnoreCase(color)) {
            guessed++;
        }
    }

    public static void playLevel() {
        Random random = new Random();
        int computerChoice = random.nextInt(5);

        checkIfGuessed(getUserAnswer(), checkComputerChoice(computerChoice));
    }

    public static void play() {
        for (; repeat < 10; repeat++) {

            playLevel();

        }
        System.out.printf("     *  *  *  GAME OVER  *  *  *\n\n  You guessed %d times out of 10", guessed);
    }
}
