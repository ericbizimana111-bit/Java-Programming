package Oop.inheritance.Hierarchical_inheritance;

public class Animal {

  String eat() {
    return "Eating...";
  }
}

class Dog extends Animal {
  String bark() {
    return "Barking...";
  }
}

class Cat extends Animal {
  String meow() {
    return "Meowing...";
  }
}

// Both Dog and Cat inherit from Animal