package com.tekwill.learning.flowcontrol.loops;

import java.util.Scanner;

public class SpeedOfSound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter \"air\", \"water\" or \"steel\" and the distance in feet");
        String env = scanner.next();
        double distance = scanner.nextDouble();

        switch (env) {
            case "air":
                System.out.printf("It takes %.2f seconds for sound to travel %.2f feet through the air", distance / 1100, distance);
                break;
            case "water":
                System.out.printf("It takes %.2f seconds for sound to travel %.2f feet through the water", distance / 4900, distance);
                break;
            case "steel":
                System.out.printf("It takes %.2f seconds for sound to travel %.2f feet through the steel", distance / 16400, distance);
                break;
            default:
                System.out.println("Error!!! Wrong input");
        }

    }
}

