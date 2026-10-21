package lab3.Book;

public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    public String label() {
        return title + " by " + author + " (" + pages + "p)";
    }

    public boolean isLong() {
        return pages >= 300;
    }
}


