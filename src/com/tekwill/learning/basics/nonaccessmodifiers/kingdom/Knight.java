package com.tekwill.learning.basics.nonaccessmodifiers.kingdom;

public class Knight {
    public static String guild = "Brave";
    public int age;
    public String nickname;

    public Knight(int age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    public static void invokeMagic() {
        System.out.println("Maaaagic");
    }

    public void fight() {
        System.out.println("Fight");
    }

    @Override
    public String toString() {
        return "Knight {" +
                "age = " + age +
                ", nickname = " + nickname +
                "}";
    }

}
