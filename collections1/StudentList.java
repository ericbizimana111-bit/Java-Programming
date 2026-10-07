package collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentList {

  public static void main(String[] args) {

    StudentComparator com = new StudentComparator();

    List<Student> students = new ArrayList<Student>();

    students.add(new Student("Eric", "Bizimana", 25));
    students.add(new Student("John", "Mugisha", 32));
    students.add(new Student("Alice", "Uwase", 21));
    students.add(new Student("David", "Niyonzima", 28));

    Collections.sort(students, com);

    Iterator<Student> it = students.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}


//give the power to the student of sorting