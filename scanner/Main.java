package scanner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Age: ");    
        int Age = input.nextInt();

        System.out.print("Height: ");
        double Height = input.nextDouble();

        input.nextLine();  // Here we are cosnuming the reamining line ending 
        

        System.out.print("FullName: ");
        String fullname = input.nextLine();

        System.out.println("Your Information");
        System.out.println("=================");
        System.out.println("FullName: "+ fullname);
        System.out.println("Age: " + Age);
        System.out.println("Height: " + Height);

        input.close();
        





           

    }
    
}
