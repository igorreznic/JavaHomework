package com.tekwill.learning.homework;

import java.util.Scanner;

public class SpeedOfSoundUsingWhile {
    public static final double SPEED_OF_SOUND_IN_AIR_FEET_SEC = 1100;
    public static final double SPEED_OF_SOUND_IN_WATER_FEET_SEC = 4900;
    public static final double SPEED_OF_SOUND_IN_STEEL_FEET_SEC = 16400;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter \"air\", \"water\" or \"steel\" and the distance in feet");
            String env = scanner.next();
            double distance = scanner.nextDouble();

            switch (env) {
                case "air":
                    System.out.printf("It takes %.2f seconds for sound to travel %.2f feet through the air", distance / SPEED_OF_SOUND_IN_AIR_FEET_SEC, distance);
                    running = false;
                    break;
                case "water":
                    System.out.printf("It takes %.2f seconds for sound to travel %.2f feet through the water", distance / SPEED_OF_SOUND_IN_WATER_FEET_SEC, distance);
                    running = false;
                    break;
                case "steel":
                    System.out.printf("It takes %.2f seconds for sound to travel %.2f feet through the steel", distance / SPEED_OF_SOUND_IN_STEEL_FEET_SEC, distance);
                    running = false;
                    break;
                default:
                    System.out.println("Error!!! Wrong input, try again.\n");
            }

        }
    }
}
