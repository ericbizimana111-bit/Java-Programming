import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    String name = "Eric";
    int age = 22;
}

public class SaveStudent {
    public static void main(String[] args)
            throws IOException {

        Student student = new Student();

        try (ObjectOutputStream out =
                 new ObjectOutputStream(
                     new FileOutputStream("student.dat"))) {

            out.writeObject(student);
            System.out.println("Student saved.");
        }
    }
}