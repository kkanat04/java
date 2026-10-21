package lab3.Book;

public class LibraryDemo {
    public static void main(String[] args) {

        Book[] shelf = new Book[3];

        shelf[0] = new Book("Dune", "Frank Herbert", 412);
        shelf[1] = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        shelf[2] = new Book("Animal Farm", "George Orwell", 112);

        int longBooks = 0;

        for (int i = 0; i < shelf.length; i++) {
            System.out.println(shelf[i].label());

            if (shelf[i].isLong()) {
                longBooks++;
            }
        }

        System.out.println("Long books: " + longBooks);
    }
}
