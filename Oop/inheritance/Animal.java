package Oop.inheritance;

public class Animal {
    public String eat() {
        return "Eating....."; // Returns a String
    }
}

class Dog extends Animal {
    public String bark() {
        return "Barking...."; // Returns a String
    }
}

Dog dog = new Dog();

dog.eat();
dog.bark();