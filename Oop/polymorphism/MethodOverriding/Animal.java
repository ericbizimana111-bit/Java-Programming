package Oop.polymorphism.MethodOverriding;

//Overriding == happens when a child class provides its own implementation of a method that already exists in the parent class.
//Take MethodOve

public class Animal {

  void speak() {
    System.out.println("Animal speaks");
  }

}

class Dog extends Animal {

  @Override
  void speak() {
    System.out.println("Dog barks");
  }

  
}