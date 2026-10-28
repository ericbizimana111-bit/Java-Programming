package Locale;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Scanner input = new Scanner(System.in);
        // input.useLocale(Locale.GERMANY);
      
        // System.out.println("Enter a decimal number here like");
        // double number = input.nextDouble();

        // System.out.printf("You Entered: %.2f%n", number);

        // // System.out.println("The decimal number you entered is: "+ number);

        // input.close();

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
      
        System.out.println("Enter a decimal number here like");
        double number = input.nextDouble();

        System.out.printf("You Entered: %.2f%n", number);

        // System.out.println("The decimal number you entered is: "+ number);

        input.close();
    }
    
}
