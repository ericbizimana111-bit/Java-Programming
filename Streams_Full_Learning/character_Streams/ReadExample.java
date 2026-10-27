package Streams_Full_Learning.character_Streams;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("student.txt")) {

            int data;

            //this repeatedly reads a single character from the file until the end of the file is reached
            while ((data = reader.read()) != -1) {
                //value converted to a character and printed to the console 
                System.out.print((char) data);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


//Commmon classes include FileInputStream,