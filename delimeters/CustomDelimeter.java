
package delimeters;

import java.util.Scanner;

public class CustomDelimeter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useDelimiter(",");

        System.out.println("Enter your name, age and marks:");
        
        String name = input.next();
        int age = input.nextInt();
        double marks = input.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        input.close();
    }
}

// a token is like the piece of the input 