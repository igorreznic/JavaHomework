package com.tekwill.learning.basics.nonaccessmodifiers.cooking;

public class Recipe {
    public static String sourceUrl = "https://www.allrecipes.com/recipes/78/breakfast-and-brunch/";
    public String title;
    public String description;

    public static void markAsCooked() { System.out.println("Cooked!");}

    public void update() {System.out.println("Updating...");}

    public Recipe(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public static void staticMethod() {
        markAsCooked();         // accessing static method
        System.out.println(sourceUrl);
        //update();    cannot access
    }

    public void instanceMethod() {
        update();
        title = "Just a title";

        markAsCooked();                   //static member accessible via instance method
        System.out.println(sourceUrl);
    }

    @Override
    public String toString() {
        return "Recipe {" +
                "title = " + title +
                ", description = " + description +
                "}" ;
    }
}
