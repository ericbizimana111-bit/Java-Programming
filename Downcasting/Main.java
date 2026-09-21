package Downcasting;

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

// Downcasting = converting a parent reference back into a child reference.

// We have a Student object, but we first refer to it as a Person. Then we
// convert the reference back to Student.

public class Main {

  public static void main(String[] args) {

    //let me treat p as sutudent now 
    Person p = new Student();

    // Downcasting must be done explicitly

    Student s = (Student) p;

    s.eat();
    s.study();

  }

}
