package collections1;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

  @Override
  public int compare(Student student1, Student student2) {

    return Integer.compare(student2.age, student1.age);
  }
}