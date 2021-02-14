package com.tekwill.learning.homework17;

import static com.tekwill.learning.homework17.PhoneBookEntry.phoneBook;

public class PhoneBookEntryDemo {
    public static void main(String[] args) {
        phoneBook.add(new PhoneBookEntry("Alex", "069443271"));
        phoneBook.add(new PhoneBookEntry("Ion", "069121212"));
        phoneBook.add(new PhoneBookEntry("Alen", "+15042485547"));
        phoneBook.add(new PhoneBookEntry("Nick", "+16022341165"));
        phoneBook.add(new PhoneBookEntry("Justin", "+16025166957"));
        phoneBook.add(new PhoneBookEntry("Mihai", "068485547"));


        for (PhoneBookEntry entry : phoneBook) {
            System.out.println(entry);
        }

        System.out.println(phoneBook.get(3).getName());
        System.out.println(phoneBook.get(0).getPhoneNumber());
    }
}
