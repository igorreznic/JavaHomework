package com.tekwill.learning.homework8;

public class DisplayCharactersMethod {
    public static void displayCharsBetween(char char1, char char2, int numbersPerLineToDisplay) {
        if (char1 > char2) {
            char temporary = char1;
            char1 = char2;
            char2 = temporary;
        }
        for (int i = (int) char1, count = 1; i <= (int) char2; i++, count++) {
            System.out.print((char) i + " ");
            if (count % numbersPerLineToDisplay == 0) System.out.println();
        }

    }

    public static void main(String[] args) {
        displayCharsBetween(' ', 'A', 12);
    }
}
