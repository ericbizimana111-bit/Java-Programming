package Oop.polymorphism.MethodOverriding;

public class AnimalMain {
  public static void main(String[] args) {

    Animal animal;
    //so at compile time java knows animal is an Animal but at run time the actual object can be DOg or cat  

    //so, Jaca waits runtime to determine which overriden speak( implementation should execute)

    //Overriding = runtime poylmorphism 

    animal = new Dog();
    animal.speak();

    animal = new Cat();
    animal.speak();
    ;

    //Animal animal = new Dog();
    /*
     * Animal is the reference
     * and new Dog is the actual object
     * 
     * the reference type is Animal
     * the actual object is Dog
     * 
     * At compile time java checks Does Animal hava a Speak() method , yes so the
     * code is valid so the program actually runs and java sees the the object is
     * actually a Dog therefore it executes
     * Dog.speak(); this is runtime polymorphism
     * 
     * //=====================   Real Life analogy of overloading and overriding ==================  //
     *   
     *             // ===== overloading ==== //
     * 
     * Overloading = choosing a restaurant order based on what you ask for
     * 
     * Imagine:
     * 
     * order(pizza)
     * order(pizza, drink)
     * order(pizza, drink, dessert)
     * 
     * The system can look at your request and immediately choose the appropriate
     * method.
     * 
     * That's like compile-time overloading.
     * 
     * 

                 // ===== overriding ==== //
     * 
     * Overriding = telling different people "speak"
     * 
     * You say:
     * 
     * "Speak!"
     * 
     * To a:
     * 
     * Dog → bark
     * Cat → meow
     * Cow → moo
     * 
     * The command is the same:
     * 
     * speak()
     * 
     * But the actual object determines the behavior.
     * 
     * That's runtime overriding.
     * 
     */

  }

}
