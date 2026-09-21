package Upcasting;

class Person {
  void eat() {
    System.out.println("Person is eating");
  }
}

class Student extends Person {
  void study() {
    System.out.println("Student is studying");
  }
}

// Upcasting = converting a child object into a parent reference.

// reference is a value that acts as a safe, managed pointer to an object living
// in the heap memory

// We take a Student and treat it as a Person.

public class Main {

  public static void main(String[] args) {

    Student s = new Student();

    // upcasting
    Person p = s;

    s.eat(); //person is eating because s object point to the person class and it becomes the reference 

    p.eat();
  

  }

}
