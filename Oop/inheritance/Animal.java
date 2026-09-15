package Oop.inheritance;

public class Animal {
    public void eat() {
        System.out.println("Eating.....");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Barking....");
    }
}
//Inheritence the reuse from another class
// in inheritence a new class can reuse the properties and methods from an existing class