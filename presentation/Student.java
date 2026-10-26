package presentation;

public class Student {
    public void introduce() {
        System.out.println("Hello, I am a student.");
    }

    public static void main(String[] args){
        Student student = new Student();
        student.introduce();
        System.out.println("Student class is working fine.");

    }
}

