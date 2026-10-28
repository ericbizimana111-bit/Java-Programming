package delimeters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three words: ");

        String first = input.next();
        String second = input.next();
        String third = input.next();

        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);

        input.close();
    }
}
