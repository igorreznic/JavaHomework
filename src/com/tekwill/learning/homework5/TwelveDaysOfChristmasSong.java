package com.tekwill.learning.homework5;

public class TwelveDaysOfChristmasSong {
    public static String dayString;
    public static int day;

    public static void main(String[] args) {
        System.out.println("On the first day of Christmas my true love sent to me\n" +
                "A partridge in a pear tree.\n");

        for (int day = 2; day < 13; day++) {
            switch (day) {
                case 2:
                    dayString = "second";
                    break;
                case 3:
                    dayString = "third";
                    break;
                case 4:
                    dayString = "fourth";
                    break;
                case 5:
                    dayString = "fifth";
                    break;
                case 6:
                    dayString = "sixth";
                    break;
                case 7:
                    dayString = "seventh";
                    break;
                case 8:
                    dayString = "eighth";
                    break;
                case 9:
                    dayString = "ninth";
                    break;
                case 10:
                    dayString = "tenth";
                    break;
                case 11:
                    dayString = "eleventh";
                    break;
                case 12:
                    dayString = "twelfth";
                    break;
            }

            System.out.println("On the " + dayString + " day of Christmas my true love sent to me");

            switch (day) {
                case 12:
                    System.out.println("Twelve drummers drumming,");
                case 11:
                    System.out.println("Eleven pipers piping,");
                case 10:
                    System.out.println("Ten lords a-leaping,");
                case 9:
                    System.out.println("Nine ladies dancing,");
                case 8:
                    System.out.println("Eight maids a-milking,");
                case 7:
                    System.out.println("Seven swans a-swimming,");
                case 6:
                    System.out.println("Six geese a-laying,");
                case 5:
                    System.out.println("Five gold rings,");
                case 4:
                    System.out.println("Four calling birds,");
                case 3:
                    System.out.println("Three French hens,");
                case 2:
                    System.out.println("Two turtle doves,");
                case 1:
                    System.out.println("And a partridge in a pear tree.");

            }
            System.out.println();

        }
    }
}
