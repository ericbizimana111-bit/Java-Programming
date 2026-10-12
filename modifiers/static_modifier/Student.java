package modifiers.static_modifier;

public class Student {
  String name; // unique for each student;
  static String college = "University of Rwanda";// Shared by all students

  Student(String name) {
    this.name = name;
  }

  // How to access it: You do not need to create an object. Access it
  // directly using the class name.
  public static void main(String[] args) {
    System.out.println(Student.college); // Outputs: University of Rwanda
  }

}


// "this belongs to the class itself, not to any object created from the class."

