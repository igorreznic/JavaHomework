package com.tekwill.learning.flowcontrol.loops;

import java.util.Scanner;

public class AverageOfNegativePositiveNumbersCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter few integers, the input ends if it is 0");

        int positives = 0;
        int negatives = 0;
        float sum = 0;

        while (scanner.hasNext()) {
            int number = scanner.nextInt();

            if (number > 0) {
                positives++;
                sum += number;
            } else if (number < 0) {
                negatives++;
                sum += number;
            } else if (positives > 0 || negatives > 0) {
                System.out.println("The number of positives is " + positives +
                        "\nThe number of negatives is " + negatives +
                        "\nThe total is " + sum +
                        "\nThe average is " + sum / (positives + negatives));
                break;
            } else {
                System.out.println("No numbers are entered except 0");
                break;
            }
        }
    }
}
