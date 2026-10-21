
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Serializable;

//By here a class is available 
class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentSerializationDemo {

    public static void main(String[] args) {

        // Step 1: Create an object //creating a student object in the memory
        // at this state the object is in the memory and not saved to the file
        Student student = new Student("Eric", 22);

        // Step 2: Serialize the object and save it
        try (ObjectOutputStream output = new ObjectOutputStream(

                // create the output stream
                // THis opens a file for writing bystes, if hte file does not exist, Java
                // normally
                // create it, If it already exists , its contens area overwritten.
                new FileOutputStream("student.dat"))) {

            output.writeObject(student);

            System.out.println("Student saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving student: "
                    + e.getMessage());
        }

        // Step 3: Deserialize the object
        try (ObjectInputStream input = new ObjectInputStream(
             
                //
                new FileInputStream("student.dat"))) {

            Student restoredStudent = (Student) input.readObject();

            System.out.println("\nStudent restored:");
            restoredStudent.display();

        } catch (IOException e) {
            System.out.println("Error reading student: "
                    + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Required class not found: "
                    + e.getMessage());
        }
    }
}
