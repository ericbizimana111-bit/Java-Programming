package Oop.inheritance.Multilevel_inheritance;

public class Animal {

  void eat() {
    System.out.println("Eating...");
  }

}

class Mammal extends Animal {
  void breath() {
    System.out.println("Breathing....");
  }
}

class Dog extends Mammal {
  void bark() {
    System.out.println("Barking");
  }
}// Now Dog gets: eat() from Animal , breathe() from Mammal and bark() from Dog
