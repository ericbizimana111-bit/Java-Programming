package Streams_Full_Learning;

import java.io.IOException;
import java.io.FileReader;

public class FileReading {

    public static void main(String[] args){

    try(FileReader reader = new FileReader("./Streams_Full_Learning/data.txt")){
        //FileReader reads one character at a time and returns the integer value of the character read. If the end of the end of the file is reached, it returns -1;
        int character = reader.read();
        if(character != -1){
            System.out.println((char)character);
        }

    }catch(IOException e){
        System.out.println("Error:"+ e.getMessage());
    }
    

}
}

//if data.txt starts with Hello The program prints H
