public class Book {
    private String title;
    private String author;
    private int pageCount;

    //constructors
    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }


    //getters 
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    //How the books will be outputted 
    public String toString() {
        return String.format("%s by %s", this.title, this.author);
    }
}