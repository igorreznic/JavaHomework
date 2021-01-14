package com.tekwill.learning.homework7;

import java.util.Scanner;

public class DisplayPatterns {
    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = n + 1 - i; k > 1; k--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int numbers = 3;
        while (numbers > 0) {
            displayPattern(scanner.nextInt());
            numbers--;
        }

    }
}
// De ex. daca am un numar nedefinit de intregi la input cum opresc ciclu asta
// while(scanner.hasNextInt()){
//     displayPattern(scanner.nextInt());
// }
//   am incercat, lucreaza dar mai asteapta input