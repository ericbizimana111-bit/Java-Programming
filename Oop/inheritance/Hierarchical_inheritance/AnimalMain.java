
package Oop.inheritance.hierarchical_inheritance;

public class AnimalMain {

  public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.eat());
        System.out.println(dog.bark());

        System.out.println(cat.eat());
        System.out.println(cat.meow());
    }
}
