
package enums.StudentSorting;
import java.util.Objects;

public class Student implements Comparable<Student> {

  private int id;
  private String firstName;
  private String lastName;
  private double grade;

  public Student(int id, String firstName, String lastName, double grade) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.grade = grade;
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public double getGrade() {
    return grade;
  }

  // Natural ordering: sort by ID in ascending order
  @Override
  public int compareTo(Student other) {
    return Integer.compare(this.id, other.id);
  }

  // Equality depends only on ID and lastName
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Student)) {
      return false;
    }

    Student other = (Student) obj;

    return this.id == other.id
        && Objects.equals(this.lastName, other.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastName);
  }

  @Override
  public String toString() {
    return "Student{id=" + id
        + ", firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\''
        + ", grade=" + grade
        + '}';
  }
}

/*
 * 
 * Understand the important parts
 * A. implements Comparable<Student>
 * This tells Java that a Student object has a natural ordering.
 * 
 * @Override
 * public int compareTo(Student other) {
 * return Integer.compare(this.id, other.id);
 * }
 * 
 * 
 * - Returns a negative number if this student's ID is smaller.
 * - Returns 0 if both IDs are equal.
 * - Returns a positive number if this student's ID is larger.
 * For example, student ID 10 comes before student ID 20.
 * B. equals()
 * return this.id == other.id
 * && Objects.equals(this.lastName, other.lastName);
 * 
 * 
 * Two students are equal only when both their IDs and last names match. The
 * first name and grade are ignored.
 * C. hashCode()
 * return Objects.hash(id, lastName);
 * 
 * 
 * The hash code uses exactly the same fields as equals(). This is important
 * when storing students in collections such as HashSet and using them as keys
 * in a HashMap.
 * 
 */