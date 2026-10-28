package Streams_Full_Learning.copying_text_file;                                                                                                       
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String sourceFile = "./Streams_Full_Learning/copying_text_file/source.txt";
        String destinationFile = "./Streams_Full_Learning/copying_text_file/destination.txt";

        //Open the resources using try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))){
            //reader opens the source file for text input.
            // writer opens the destination file for text output.
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully!");
            // Java automatically closes both resources when the try block finishes, including when an exception occurs. 
            // This prevents resources from being left open unnecessarily.
        } catch (IOException e) {
            System.out.println("File copying failed: " + e.getMessage());
        }
    }
}
