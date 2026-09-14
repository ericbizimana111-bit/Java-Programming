package setters;

public class Student {

    private String firstName;
    private String lastName;
    private String email;

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String setFirstName() {
        return this.firstName;
    }

    public String setLastName() {
        return this.lastName;
    }

    public String setEmail() {
        return this.email;
    }

}
