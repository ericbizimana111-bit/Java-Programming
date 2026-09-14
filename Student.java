// public class Student {
//     private String firstName;
//     private String lastName;
//     private String email;

//     Student(String firstName) { // this one initializes the constuctor of the first name
//         this.firstName = firstName;
//     }

//     Student(String firstName, String lastName, String email) { // in this we will call that one of first name
//         this(firstName);// this calls the first constructor this calls Student(String firstName) which
//                         // does this.firstName = firstName
//         this.lastName = lastName; // this.firstName is like student.firstName = firstName
//         this.email = email;
//         // this means call another constructor in this same class
//         // constructor cha
//         //       | Code |                    | Meaning |
//         // | ---------------- | -------------------------------------- |
//         // | `this.firstName` | This object's `firstName`              |
//         // | `this.lastName`  | This object's `lastName`                |
//         // | `this(...)`      | Call another constructor in this class      |

//     }

//     String display() {
//         return "Name:" + firstName + " " + lastName + "\nEmail:" + email;
//     }

//     public static void main(String[] args) {

//         Student student = new Student("Bizimana", "Eric", "ericbizimana111@gmail.com");
//         System.out.println(student.display());

//     }

// }

// //any pulbic method can access them private varibles int eh class we have getter and setters //private varibles can be accessible only in the same class;
//getter and setters are special method that are used to get and set the values 






//====================== using the getters to access the private varibles values in other files not in the same class ================= //4
// ========================== getting the access to the private varibles in the class that are only accessible in the class in other file ================== //
public class Student {
    private String firstName;
    private String lastName;
    private String email;

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

}
