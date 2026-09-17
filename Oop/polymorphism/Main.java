package Oop.polymorphism;

public class Main {

    public static void main(String[] args) {
        // UPCASTING
        /*
         * Upcasting = Casting a subclass type to a superclass type
         * 
         */
        // this is upcasting
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.speak();
        cat.speak();
        /*
         * Downcasting (The opposite)
         * Definition: Casting a superclass type back down to a subclass type
         * .Syntax: Must be done manually with explicit casting.
         * 
         * Example:
         * 
         * Animal dog = new Dog(); // Upcasting
         * Dog myDog = (Dog) dog; // Downcasting
         * myDog.speak(); // Dog barks
         * Use code with caution.
         */

    }
}
