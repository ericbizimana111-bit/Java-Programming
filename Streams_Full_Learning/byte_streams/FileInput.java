package Streams_Full_Learning.byte_streams;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) {

        try (FileInputStream input = new FileInputStream("./Streams_Full_Learning/byte_streams/data.bin")) {

            int value = input.read();
            System.out.println(value);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}

//suppose the first byte in data.bin has the decimal value 65 . The program prints  65 

//Bro, 72 is the ASCII value of the character H. Your program is probably reading
// a byte from data.bin and printing its numeric value. the byste streams read sand output the 
//byte asscii values not charactesr like character streams 