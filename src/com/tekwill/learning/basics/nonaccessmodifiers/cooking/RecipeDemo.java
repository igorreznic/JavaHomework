package com.tekwill.learning.basics.nonaccessmodifiers.cooking;

import static com.tekwill.learning.basics.nonaccessmodifiers.cooking.Recipe.*;

public class RecipeDemo {
    public static void main(String[] args) {
        Recipe recipe1 = new Recipe("Omelete", "Oven baked omelete" );
        Recipe recipe2 = new Recipe("Bacon", "Bacon for the Family or a Crowd");
        Recipe recipe3 = new Recipe("Pancakes", "Fluffy Pancakes");

        System.out.println(recipe1);
        System.out.println("recipe2.title is " + recipe2.title);
        System.out.println("recipe3.description is " + recipe3.description);

        recipe1.update();
        markAsCooked();

        System.out.println(recipe2 + "\n" + recipe3);

        System.out.println(sourceUrl);

        System.out.println(recipe2.sourceUrl); //runs but not recommended calling a class/static variable through instance reference

        /*
        public void staticMethod() {            java: illegal start of expression  ????
          System.out.println(recipe1);
        }
        */
        System.out.println("Calling staticMethod()...");
        staticMethod();

        //Recipe.instanceMethod();    java: non-static method instanceMethod() cannot be referenced from a static context
    }

}
