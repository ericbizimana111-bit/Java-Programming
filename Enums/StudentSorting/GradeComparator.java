
package enums.StudentSorting;

import java.util.Comparator;

public class GradeComparator implements Comparator<Student> {

  @Override
  public int compare(Student s1, Student s2) {
    return Double.compare(s2.getGrade(), s1.getGrade());
  }
}

/*
 * Why s2 comes first?
 * Double.compare(s2.getGrade(), s1.getGrade())
 * 
 * 
 * Reversing the arguments produces descending order.
 * For example:
 * - Student A: 95.0
 * - Student B: 80.0
 * - Student C: 70.0
 * The sorted order is A, B, C.
 * 
 */