package com.tekwill.learning.homework11;

import java.util.Random;

public class DiceGame {
    static int computerScore;
    static int userScore;

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        System.out.println("    <<  << Game Starts >>  >> \n");
        for (int i = 0; i < 10; i++) {
            int computerValue = random.nextInt(6) + 1;
            int userValue = random.nextInt(6) + 1;
            if (computerValue > userValue) {
                computerScore++;
                System.out.printf("Round %d     [%d] : [%d]   Computer Wins!   Score:  Computer  [%d] : [%d]  User\n", i + 1, computerValue, userValue, computerScore, userScore);
                Thread.sleep(500);
            } else if (computerValue < userValue) {
                userScore++;
                System.out.printf("Round %d     [%d] : [%d]      You Win!      Score:  Computer  [%d] : [%d]  User\n", i + 1, computerValue, userValue, computerScore, userScore);
                Thread.sleep(500);
            } else {
                System.out.printf("Round %d     [%d] : [%d]       Tie!!!       Score:  Computer  [%d] : [%d]  User\n", i + 1, computerValue, userValue, computerScore, userScore);
                Thread.sleep(500);
            }
        }
        System.out.println();
        if (computerScore > userScore) {
            System.out.printf("Computer Won the game with a total score %d  to %d", computerScore, userScore);
        } else if (computerScore < userScore) {
            System.out.printf("You Won the game with a total score %d  to %d", userScore, computerScore);
        } else System.out.printf("It's Tie!!!  Total Score %d to %d", userScore, computerScore);
    }
}
