package com.tekwill.learning.basics.io.reading;

import java.util.Scanner;

public class Latitude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner initialization

        System.out.println("Please enter a latitude in degrees, minutes and seconds:\n" +
                "First, enter the degrees (max 90):");
        int latitude = scanner.nextInt();

        System.out.println("Now, enter the minutes of arc (max 60):");
        int minutes = scanner.nextInt();

        System.out.println("Finally, enter the seconds of arc (max 60):");
        int seconds = scanner.nextInt();

        float latitudeDecimal = latitude + minutes / 60F + seconds / 3600F;

        System.out.println(latitude + " degrees, " + minutes + " minutes, " + seconds + " seconds = " + latitudeDecimal + " degrees");
    }
}