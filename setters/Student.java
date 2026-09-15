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

    // Gettersjava 
    public String getFirstName() {
        return this.firstName; //we used this in teh getters to return the firstName belonging to the Student object 
        //and also  if you write only   firstName it will work they are equiavlen t
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email; 
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName; 
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // A setter changes / set a value
    // A setter shoudl receive a value and assign it

}
 