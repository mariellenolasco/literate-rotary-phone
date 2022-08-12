package com.example;

import com.example.models.Hero;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // creating a Hero object
        // instantiating a hero object
        // taking the Hero Class template and we're making an actual object
        // that contains actual data
        Hero hero = new Hero();
        hero.heroId = 1;
        hero.heroAlias = "Batman";
        hero.heroName = "Bruce Wayne";
    }
}
