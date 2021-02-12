package com.tekwill.learning.homework16;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class WordSeparator {
    public static String wordSeparator(String string) {

        for (int i = 0; i < string.length() - 1; i++) {
            if (isUpperCase(string.charAt(i + 1))) {
                string = string.replace(Character.toString(string.charAt(i + 1)), " " + toLowerCase(string.charAt(i + 1)));
            }
        }
        return string;
    }

    public static void main(String[] args) {
        System.out.println(wordSeparator("Hello,MyNameIs."));
    }
}
