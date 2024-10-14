package Homework.Fifth;

public class Library {

    private final Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book getBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public String[] getNames() {
        String[] bookNames = new String[books.length];
        for (int i = 0; i < books.length; i++) {
            bookNames[i] = books[i].getTitle();
        }
        return bookNames;
    }

}
