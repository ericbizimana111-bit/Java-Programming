
package enums.StudentSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    // Create Student objects
    
    Student s1 = new Student(103, "Alice", "Mugisha", 85.5);
    Student s2 = new Student(101, "Bob", "Niyonzima", 92.0);
    Student s3 = new Student(104, "Carol", "Uwase", 78.0);
    Student s4 = new Student(102, "David", "Habimana", 96.5);

    // Store students in a List
    List<Student> students = new ArrayList<>();

    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);

    // 1. Sort using Comparable (ID ascending)
    Collections.sort(students);

    System.out.println("=== SORT BY ID (Comparable) ===");

    for (Student student : students) {
      System.out.println(student);
    }

    // 2. Sort using Comparator (grade descending)
    Collections.sort(students, new GradeComparator());

    System.out.println("\n=== SORT BY GRADE (Comparator) ===");

    for (Student student : students) {
      System.out.println(student);
    }

    // 3. Test equals() and hashCode()
    Student s5 = new Student(101, "DifferentFirstName",
        "Niyonzima", 50.0);

    System.out.println("\n=== EQUALITY TEST ===");

    System.out.println("s2 equals s5: " + s2.equals(s5));

    System.out.println("s2 hashCode: " + s2.hashCode());
    System.out.println("s5 hashCode: " + s5.hashCode());
  }
}

/*

      This file creates four students, puts them into a List, and sorts the same list using both sorting methods.

      import java.util.ArrayList;
      import java.util.Collections;
      import java.util.List;

      public class Main {

          public static void main(String[] args) {

              // Create Student objects
              Student s1 = new Student(103, "Alice", "Mugisha", 85.5);
              Student s2 = new Student(101, "Bob", "Niyonzima", 92.0);
              Student s3 = new Student(104, "Carol", "Uwase", 78.0);
              Student s4 = new Student(102, "David", "Habimana", 96.5);

              // Store students in a List
              List<Student> students = new ArrayList<>();

              students.add(s1);
              students.add(s2);
              students.add(s3);
              students.add(s4);

              // 1. Sort using Comparable (ID ascending)
              Collections.sort(students);

              System.out.println("=== SORT BY ID (Comparable) ===");

              for (Student student : students) {
                  System.out.println(student);
              }

              // 2. Sort using Comparator (grade descending)
              Collections.sort(students, new GradeComparator());

              System.out.println("\n=== SORT BY GRADE (Comparator) ===");

              for (Student student : students) {
                  System.out.println(student);
              }

              // 3. Test equals() and hashCode()
              Student s5 = new Student(101, "DifferentFirstName",
                      "Niyonzima", 50.0);

              System.out.println("\n=== EQUALITY TEST ===");

              System.out.println("s2 equals s5: " + s2.equals(s5));

              System.out.println("s2 hashCode: " + s2.hashCode());
              System.out.println("s5 hashCode: " + s5.hashCode());
          }
      }



      5. Expected output
      The exact hash-code numbers can vary depending on the implementation, but the sorting and equality results should be as follows.
      First sort — by ID, ascending
      === SORT BY ID (Comparable) ===
      Student{id=101, firstName='Bob', lastName='Niyonzima', grade=92.0}
      Student{id=102, firstName='David', lastName='Habimana', grade=96.5}
      Student{id=103, firstName='Alice', lastName='Mugisha', grade=85.5}
      Student{id=104, firstName='Carol', lastName='Uwase', grade=78.0}


      Second sort — by grade, descending
      === SORT BY GRADE (Comparator) ===
      Student{id=102, firstName='David', lastName='Habimana', grade=96.5}
      Student{id=101, firstName='Bob', lastName='Niyonzima', grade=92.0}
      Student{id=103, firstName='Alice', lastName='Mugisha', grade=85.5}
      Student{id=104, firstName='Carol', lastName='Uwase', grade=78.0}


      Equality test
      === EQUALITY TEST ===
      s2 equals s5: true


      Why is it true? Both students have ID 101 and last name "Niyonzima". Their first names and grades differ, but those fields are not used by equals().
      Their hash codes must also be equal because their IDs and last names are equal.
      6. How to run the program
      Open the VS Code terminal in the StudentSorting directory and execute:
      javac Student.java GradeComparator.java Main.java
      java Main


      The first command compiles all three files. The second runs the Main class.


      7. Key differences to remember

      Feature	Purpose in this exercise

      Comparable<Student>	Defines the natural ordering by ID
      compareTo()	  Compares two students by ID
      Comparator<Student>	      Defines another ordering by grade
      compare()	Compares two students by grade
      equals()	Checks equality using ID and last name
      hashCode()	Generates a hash code using ID and last name
      Collections.sort(list)	Uses the natural ordering
      Collections.sort(list, comparator)	Uses the specified comparator




      
      Important exam point: Comparable is implemented inside the class being sorted, whereas Comparator lets you define a separate sorting strategy without changing that class's natural ordering.
      One subtle point: compareTo() compares only IDs, while equals() compares IDs and last names. Therefore, two students with the same ID but different last names compare as 0 using compareTo() even though equals() returns false. That is allowed, although it is worth understanding when using sorted sets or sorted maps.

*/