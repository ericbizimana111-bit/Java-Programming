import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {

    public String name;
    public LocalDate birthDay;
    public ArrayList<Book> books = new ArrayList<Book>();
    // this is hte ArrayList of type book with the name book and new ArrayList<book>
    // creates the memeory of the books
    // Since these variablea are declared on the class level they will be
    // initialized by null
    // they will be given default values

    // in java function is called a method and make sure that the method must always
    // have the return type
    // public borrow(){

    // }

    public void borrow(Book book) {
        // This is a method named borrow that takes one parameter: 
        // book. The method is public, which means it can be 
        // accessed from outside the class. The return type is void, 
        // which means this method doesn't return any value.
        this.books.add(book);
        // This line adds the book object to a collection called books.
        // The this keyword refers to the current object,
        // which is the instance of the class that owns the borrow method.
    }

    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();
        // for here the value of this would be youngerUser object or older user object
        // it simply represent the object created from the class blueprint
        return age;
    }

}