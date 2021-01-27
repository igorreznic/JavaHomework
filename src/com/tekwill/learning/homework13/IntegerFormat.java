package com.tekwill.learning.homework13;

public class IntegerFormat {

    public static void main(String[] args) {
        System.out.println(format(34567, 4));

    }

    public static String format(int number, int width) {
        String zeros = "";
        int numberLength = String.valueOf(number).length();
        if (numberLength >= width) {
            return String.valueOf(number);
        } else {
            for (int i = 0; i < width - numberLength; i++) {
                zeros = zeros.concat("0");
            }
            return zeros.concat(String.valueOf(number));
        }
    }
}
