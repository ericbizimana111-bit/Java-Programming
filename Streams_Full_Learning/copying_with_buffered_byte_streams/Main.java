
package Streams_Full_Learning.copying_with_buffered_byte_streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String sourceFile =
                "Streams_Full_Learning/copying_with_buffered_byte_streams/source.txt";

        String destinationFile =
                "Streams_Full_Learning/copying_with_buffered_byte_streams/destination.txt";

        try (
                BufferedInputStream input =
                        new BufferedInputStream(
                                new FileInputStream(sourceFile));

                BufferedOutputStream output =
                        new BufferedOutputStream(
                                new FileOutputStream(destinationFile))
        ) {
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println(
                    "File copying failed: " + e.getMessage());
        }
    }
}
