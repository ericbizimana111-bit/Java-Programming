package setters;

public class setters {
    public static void main(String[] args) {
         Student student = new Student("Bizimana", "Eric", "ericbizimana111@gmail.com");
        System.out.printf("%s %s %s",student.setFirstName(),student.setLastName(),student.setEmail());
    }
}
