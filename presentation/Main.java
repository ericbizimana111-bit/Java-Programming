package presentation;
public class Main {
    public static void main(String[] args)


            throws ClassNotFoundException {
        Class.forName("presentation.Student");
        
        System.out.println("Class loaded successfully.");
        System.out.println("student class is found in the presentation package.");
    }
}