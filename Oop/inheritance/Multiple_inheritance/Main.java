package Oop.inheritance.Multiple_inheritance;

interface Animal {
  void eat();
}

interface Pet {
  void play();
}

class Dog implements Animal, Pet {
  public void eat() {
    System.out.println("Dog is eating");
  }

  public void play() {
    System.out.println("Dog is playing");
  }
}

public class Main {
  public static void main(String[] args) {
    
    Dog dog = new Dog();

    dog.eat();
    dog.play();

  }

}

// Java multiple inheritance with clases is not possible , but multiple
// interfaces works

// One important correction: Java does not allow a class to extend multiple
// classes, but a class can implement multiple interfaces.