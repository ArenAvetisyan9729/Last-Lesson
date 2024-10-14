package Homework.Fifth;

public class Book {

    private Author author;
    private String title;
    private int yearPublished;
    private int numberOfPages;

    public Book(Author author, String title, int yearPublished, int numberOfPages) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return title + " by " + author.getName() + " " + author.getSurname();
    }
}
