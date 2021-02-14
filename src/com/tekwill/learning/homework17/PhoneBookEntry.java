package com.tekwill.learning.homework17;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookEntry {
    public static List<PhoneBookEntry> phoneBook = new ArrayList<>();
    private String name;
    private String phoneNumber;

    public PhoneBookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Phone Number: " + getPhoneNumber() + ".";
    }

}
