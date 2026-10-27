package Streams_Full_Learning;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileInputStream input = new FileInputStream("data.bin")) {

            int value = input.read();
            System.out.println(value);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}

//suppose the first byte in data.bin has the decimal value 65 . The program prints  65 
