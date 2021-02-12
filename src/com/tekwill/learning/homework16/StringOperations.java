package com.tekwill.learning.homework16;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringOperations {

    public static int wordCount(String string) {
        return string.split(" ").length;
    }

    public static String arrayToString(char[] charArray) {
        String string = new String();
        for (int i = 0; i < charArray.length; i++) {
            string = string.concat(String.valueOf(charArray[i]));
        }
        return string;
    }

    public static void mostFrequent(String string) {
        char currentChar;
        char[] charArray = string.toCharArray();
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            if (!charFrequency.containsKey(charArray[i])) {
                currentChar = charArray[i];
                int counter = 1;

                for (int j = i + 1; j < charArray.length; j++) {
                    if (charArray[j] == currentChar) {
                        counter++;
                    }
                }
                charFrequency.put(currentChar, counter);
            }
        }
        int maxFrequency = Collections.max(charFrequency.values());

        System.out.print("Characters: ");

        for (char i : charFrequency.keySet()) {
            if (charFrequency.get(i) == maxFrequency) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("occurs " + maxFrequency + " times");
    }

    public static String replaceSubstring(String initialString, String substring, String stringToReplaceWith) {
        String newString = initialString.replaceAll(substring, stringToReplaceWith);

        return newString;
    }


    public static void main(String[] args) {
        System.out.println(wordCount("this dog, jumped over the fence. "));

        char[] array = {'j', 'u', 'm', 'p', 'e', 'd', ' ', 'o', 'v', 'e', 'r'};

        System.out.println(arrayToString(array));

        mostFrequent("abcde fg aaabbb");

        System.out.println(replaceSubstring("one two three two one zero", "two", "three"));

    }
}
