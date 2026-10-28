package Locale;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // input.useLocale(Locale.GERMANY);

        // System.out.println("Enter a decimal number here like 2.9");
        // double number = input.nextDouble();

        // System.out.printf("You Entered: %.2f%n", number);

        // // System.out.println("The decimal number you entered is: "+ number);

        // input.close();





        // Scanner input = new Scanner(System.in);
        // input.useLocale(Locale.GERMANY);

        // System.out.println("Enter a decimal number here like 9,9");
        // double number = input.nextDouble();

        // System.out.printf(Locale.GERMANY, "You Entered: %.2f%n", number);

        // // System.out.println("The decimal number you entered is: "+ number);

        // input.close();





        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.UK);

        System.out.println("Enter a decimal number here like 9.9");
        double number = input.nextDouble();

        System.out.printf(Locale.UK, "You Entered: %.2f%n", number);

        // System.out.println("The decimal number you entered is: "+ number);

        input.close();
    }

}
