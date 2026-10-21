import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudent {
    public static void main(String[] args) {

        try (ObjectInputStream in =
                 new ObjectInputStream(
                     new FileInputStream("student.dat"))) {

            Object obj = in.readObject();

            System.out.println("Object restored.");

        } catch (ClassNotFoundException e) {
            System.out.println(
                "Cannot restore object: " + e.getMessage());

        } catch (IOException e) {
            System.out.println(
                "File error: " + e.getMessage());
        }
    }
}