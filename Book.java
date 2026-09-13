public class Book {
    public String title;
    public String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    };

    

    public String toString() {
        return String.format("%s by %s", this.title, this.author);
    }
}
