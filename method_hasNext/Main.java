package method_hasNext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Age: ");

        if (input.hasNextInt()) {
           
            int age = input.nextInt();
            System.out.println("Your age is: " + age);

        } else {

            System.out.println("Enter the valid input");

        }

        input.close();
        
    }

}
