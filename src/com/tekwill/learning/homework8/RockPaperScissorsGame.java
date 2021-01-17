package com.tekwill.learning.homework8;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static int getUserAnswer() {
        System.out.println("Enter Your choice: press       [1] for Rock,        [2] for Paper         or [3] for Scissors");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getComputerAnswer() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    public static void playAgain() {
        System.out.println("\nPress [Y] if you want to play again, or any key to EXIT the game.");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        if (response.equalsIgnoreCase("Y")) {
            play();
        } else {
            System.out.println("Game Over");
        }
    }

    public static void play() {
        int computerAnswer = getComputerAnswer();
        int userAnswer = getUserAnswer();

        checkAnswers(computerAnswer, userAnswer);

        playAgain();
    }

    public static void checkAnswers(int computerChoice, int userChoice) {
        if (computerChoice == userChoice) {
            System.out.println("Tie!!! You both chose the same element\n[" + computerChoice + "] : [" + userChoice + "]");

        } else if (computerChoice == 1 && userChoice == 3) {
            System.out.println("You Lost!!!     You [Scissors]   :   [Rock]  Computer");

        } else if (computerChoice == 2 && userChoice == 1) {
            System.out.println("You Lost!!!     You [Rock]   :   [Paper]  Computer ");

        } else if (computerChoice == 3 && userChoice == 2) {
            System.out.println("You Lost!!!     You  [Paper]   :   [Scissors]  Computer");

        } else if (computerChoice == 1 && userChoice == 2) {
            System.out.println("You Won!!!     You [Paper]   :  [Rock]  Computer");

        } else if (computerChoice == 2 && userChoice == 3) {
            System.out.println("You Won!!!     You [Scissors]   :  [Paper]  Computer");

        } else if (computerChoice == 3 && userChoice == 1) {
            System.out.println("You Won!!!     You  [Rock]   :  [Scissors]  Computer");

        } else {
            System.out.println("Wrong input");

        }
    }


}
