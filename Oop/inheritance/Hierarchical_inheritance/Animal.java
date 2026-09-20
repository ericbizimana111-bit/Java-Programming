package Oop.inheritance.Hierarchical_inheritance;

public class Animal {

  void eat() {
    System.out.println("Eating...");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("Barking...");
  }
}

class Cat extends Animal {
  void meow() {
    System.out.println("Meowing...");
  }
}

// Both Dog and Cat inherit from Animal