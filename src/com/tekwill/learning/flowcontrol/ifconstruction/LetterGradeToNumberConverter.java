package com.tekwill.learning.flowcontrol.ifconstruction;

public class LetterGradeToNumberConverter {
    public static int number;


    public static void convertToNumber(char letter) {
        if (letter == 'A') {
            System.out.println("The numeric value for grade A is 4");
        } else if (letter == 'B') {
            System.out.println("The numeric value for grade B is 3");
        } else if (letter == 'C') {
            System.out.println("The numeric value for grade C is 2");
        } else if (letter == 'D') {
            System.out.println("The numeric value for grade D is 1");
        } else if (letter == 'F') {
            System.out.println("The numeric value for grade F is 0");
        } else {
            System.out.println(letter + " is an invalid grade");
        }

    }

}
