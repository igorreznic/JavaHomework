package com.tekwill.learning.basics.nonaccessmodifiers.kingdom;

import static com.tekwill.learning.basics.nonaccessmodifiers.kingdom.Knight.guild;


public class KnightDemo {
    public static void main(String[] args) {
        Knight knight1 = new Knight(35, "Karol");
        Knight knight2 = new Knight(39, "Arthur");
        Knight knight3 = new Knight(42, "Loo");

        System.out.println(knight1);
        System.out.println("knight2.nickname = " + knight2.nickname);
        System.out.println("knight3.age = " + knight3.age);
        System.out.println(guild); // works, but discouraged to use
        knight1.fight();
        knight2.fight();
        knight2.invokeMagic(); // works, but discouraged to use
        System.out.println(guild);
        Knight.invokeMagic();
    }
}
