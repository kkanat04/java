package lab3.Book;

public class BookDemo {
    public static void main(String[] args) {

        Book book1 = new Book("Dune", "Frank Herbert", 412);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);

        System.out.println(book1.label());
        System.out.println(book2.label());

    }
}
