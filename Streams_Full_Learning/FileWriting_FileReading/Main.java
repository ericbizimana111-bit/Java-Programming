package Streams_Full_Learning.FileWriting_FileReading;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Step 1: Write text into a file.
        try (FileWriter writer = new FileWriter("./Streams_Full_Learning/FileWriting_FileReading/student.txt")) {
            writer.write("Name: Eric\n");
            writer.write("Course: Computer Science\n");

            System.out.println("Text saved successfully.");

        } catch (IOException e) {
            System.out.println("Writing error: " + e.getMessage());
        }

        // Step 2: Read the text from the file.
        try (FileReader reader = new FileReader("./Streams_Full_Learning/FileWriting_FileReading/student.txt")) {
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

        } catch (IOException e) {
            System.out.println("Reading error: " + e.getMessage());
        }
    }
}