package java_program;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.US);

            System.out.print("Enter the number of students: ");

            if (!input.hasNextInt()) {
                System.out.println("Error: Please enter a whole number.");
                return;
            }

            int numberOfStudents = input.nextInt();
            input.nextLine(); // Consume the remaining line ending.

            if (numberOfStudents <= 0) {
                System.out.println("Error: Number of students must be positive.");
                return;
            }

            String[] names = new String[numberOfStudents];
            double[] marks = new double[numberOfStudents];

            for (int i = 0; i < numberOfStudents; i++) {
                System.out.printf("%nEnter details for student %d:%n", i + 1);

                System.out.print("Full name: ");
                names[i] = input.nextLine().trim();

                if (names[i].isEmpty()) {
                    System.out.println("Error: Name cannot be empty.");
                    return;
                }

                System.out.print("Mark (0-100): ");

                if (!input.hasNextDouble()) {
                    System.out.println("Error: Please enter a valid number.");
                    return;
                }

                marks[i] = input.nextDouble();
                input.nextLine(); // Consume the remaining line ending.

                if (marks[i] < 0 || marks[i] > 100) {
                    System.out.println("Error: Mark must be between 0 and 100.");
                    return;
                }
            }

            System.out.println("\n========== STUDENT RESULTS ==========");

            System.out.printf(
                "%-5s %-25s %10s %12s%n",
                "No.", "Student Name", "Mark", "Grade"
            );

            System.out.println(
                "------------------------------------------------------"
            );

            for (int i = 0; i < numberOfStudents; i++) {
                String grade;

                if (marks[i] >= 80) {
                    grade = "A";
                } else if (marks[i] >= 70) {
                    grade = "B";
                } else if (marks[i] >= 60) {
                    grade = "C";
                } else if (marks[i] >= 50) {
                    grade = "D";
                } else {
                    grade = "F";
                }

                System.out.printf(
                    "%-5d %-25s %10.2f %12s%n",
                    i + 1, names[i], marks[i], grade
                );
            }

            System.out.println(
                "------------------------------------------------------"
            );
            System.out.println("Results displayed successfully.");
        }
    }
}
