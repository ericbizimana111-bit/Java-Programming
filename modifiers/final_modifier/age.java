package modifiers.final_modifier;

public class age {

    final int age = 20;
    // age = 25; //// ❌ Compile-time Error: cannot assign a value to final variable
    // age

}

/*
 * 1. Final Methods (Cannot be Overridden):
 * 
 * you make a method final, a child class cannot override it to change its
 * behavior.java
 * class Parent {
 * final void showMessage() {
 * System.out.println("This cannot be changed!");
 * }
 * }
 */

// If you make a class final, no other class can extend (inherit) it. For
// example, Java's built-in String class is final.java
// final class Vehicle { ... }
// // class Car extends Vehicle { } // ❌ Error: Cannot inherit from final
// Vehicle

// final variable → cannot change the value
// final method → cannot override the method
// final class → cannot extend the class

// For example:

// final class Student {
// }

// means:

// class Person extends Student { } // ❌ Error

// Because a final class cannot be inherited.

// sealed is a non-access modifier used to control which classes are allowed
// to// inherit from a class or implement an interface.

// public sealed class Animal

// //         permits Dog, Cat {

// // }

// This means only Dog and Cat are allowed to extend Animal.

// public final class Dog extends Animal {
// }

// public final class Cat extends Animal {
// }

// But this is not allowed:

// public class Cow extends Animal {
//     // ❌ Error
// }
// sealed vs final
// Modifier	Meaning
// final	Nobody can extend the class
// sealed	Only specified classes can extend it
// non-sealed	Removes the inheritance restriction for a permitted subclass

// Think of it like:

// final


// // sealed controls inheritance 

// It tells Java:

// “Only these specific classes are allowed to extend this class.”

// Example:

// sealed class Animal permits Dog, Cat {
// }

// Here:

// Animal → can be inherited
// Dog → allowed to extend Animal
// Cat → allowed to extend Animal
// Any other class → ❌ cannot extend Animal

// So, in one sentence:

// sealed limits which classes can inherit from a class.


// sealed vs final
// Modifier	Meaning
// final	Nobody can extend the class
// sealed	Only specified classes can extend it
// non-sealed	Removes the inheritance restriction for a permitted subclass


// sealed controls inheritance.

// It tells Java:

// “Only these specific classes are allowed to extend this class.”

// Example:

// sealed class Animal permits Dog, Cat {
// }

// Here:

// Animal → can be inherited
// Dog → allowed to extend Animal
// Cat → allowed to extend Animal
// Any other class → ❌ cannot extend Animal

// So, in one sentence:

// sealed limits which classes can inherit from a class.