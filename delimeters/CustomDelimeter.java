package delimeters;

import java.util.Scanner;

public class CustomDelimeter {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        input.useDelimiter(",");

        System.out.println("Enter your name , age and marks:" );
        input.nextLine();
        String name = input.next();
        int age = input.nextInt();
        Double marks = input.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        input.close();
    }
}