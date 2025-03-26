package model;  // Declares this class is inside the 'model' package

/**
 * Represents a Book in the Library System
 */
public class Book {
    private String bookId;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    /**
     * Constructor to initialize book details
     */
    public Book(String bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    // Getter methods
    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public boolean isAvailable() { return isAvailable; }

    // Setter methods
    public void setAvailable(boolean available) { isAvailable = available; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }

    /**
     * Returns book details as a formatted string
     */
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + 
               ", Genre: " + genre + ", Status: " + (isAvailable ? "Available" : "Checked Out");
    }
}
