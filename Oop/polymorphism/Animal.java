package Oop.polymorphism;

/*

Polymorphism == one command different behaviour the command may be the same but the baviour is different 
depending on the object.

Polymorphism == one interface / method , multiple possible behaviours 


*/

public class Animal {

    public void speak() {
        System.out.println("Animal speaks");
    }

}

class Dog extends Animal {

    public void speak() {
        System.out.println("Dog barks");
    }

}

class Cat extends Animal {
    public void speak() {
        System.out.println("Cat meows");
    }
}
