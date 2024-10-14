package Homework.Fifth;

import java.util.Scanner;

public class LibraryDemo {

    public static void main(String[] args) {

        Author author1 = new Author("Frank", "Herbert", "1920-10-08", "1986-02-11");
        Author author2 = new Author("J.K.", "Rowling", "1965-07-31", null);
        Book[] books = {
                new Book(author1, "Dune", 1963, 415),
                new Book(author2, "Harry Potter and the Goblet of Fire", 2000, 300)
        };

        Library library = new Library(books);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library!");
        while (true) {
            System.out.println("Type 1 to list the names of all of the books in the library.");
            System.out.println("Type 2 to search for a book.");
            System.out.println("Type 0 to exit.");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Books is in the library:");
                    String[] bookNames = library.getNames();
                    for (String name : bookNames) {
                        System.out.println(name);
                    }
                    break;

                case 2:
                    System.out.print("Enter the name of the book: ");
                    String bookName = scanner.nextLine();
                    Book foundBook = library.getBook(bookName);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook);
                        while (true) {
                            System.out.println("Type 1 to access the author information.");
                            System.out.println("Type 2 to access the year of publication.");
                            System.out.println("Type 3 to access the number of pages.");
                            System.out.println("Type 4 to search for another book.");
                            System.out.println("Type 5 to list the names of all of the books present in the library.");
                            System.out.println("Type 0 to exit.");
                            int infoChoice = scanner.nextInt();
                            scanner.nextLine();

                            switch (infoChoice) {
                                case 1:
                                    System.out.println("Author: " + foundBook.getAuthor());
                                    break;
                                case 2:
                                    System.out.println("Year Published: " + foundBook.getYearPublished());
                                    break;
                                case 3:
                                    System.out.println("Number of Pages: " + foundBook.getNumberOfPages());
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    String[] allBookNames = library.getNames();
                                    for (String name : allBookNames) {
                                        System.out.println(name);
                                    }
                                    break;
                                case 0:
                                    System.out.println("Exit");
                                    scanner.close();
                                    return;
                            }
                        }
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 0:
                    System.out.println("Exit");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

}
