package setters;

public class Setters {
    public static void main(String[] args) {
        Student student = new Student("kim", "jongun", "kimjongun@gmail.com");

        student.setFirstName("kang");
        student.setLastName("gitan");
        student.setEmail("kanggitan@gmail.com");

        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getEmail());

    }
}
// A setter changes / set a value
// // A setter shoudl receive a value and assign it