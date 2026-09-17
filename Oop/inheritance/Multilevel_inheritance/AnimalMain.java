package Oop.inheritance.Multilevel_inheritance;

public class AnimalMain {
  public static void main(String[] args) {
    Dog dog = new Dog();

    System.out.println("============For the Dog class ===============");

    dog.bark();
    dog.eat();
    dog.breath();



    System.out.println("============For the Mammal class==============");

    Mammal mammal = new Mammal();
    mammal.breath();
    mammal.eat();




    System.out.println("============For the Animal class==============");

    Animal animal = new Animal();
    animal.eat();

  }

}
