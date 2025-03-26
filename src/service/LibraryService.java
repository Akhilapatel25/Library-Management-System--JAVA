package service;

import model.Book;
import java.util.HashMap;
import java.util.Map;

/**
 * Manages the library's book collection
 */
public class LibraryService {
    private final Map<String, Book> bookCollection = new HashMap<>();  // HashMap to store books

    /**
     * Adds a new book to the collection
     */
    public void addBook(Book book) {
        bookCollection.put(book.getBookId(), book);
        System.out.println("Book added successfully.");
    }

    /**
     * Checks if a book exists by ID
     */
    public boolean bookExists(String bookId) {
        return bookCollection.containsKey(bookId);
    }

    /**
     * Displays all books in the library
     */
    public void viewAllBooks() {
        if (bookCollection.isEmpty()) {
            System.out.println("No books available.");
        } else {
            bookCollection.values().forEach(System.out::println);
        }
    }

    /**
     * Searches for a book by ID or Title
     */
    public void searchBook(String searchTerm) {
        boolean found = false;
        for (Book book : bookCollection.values()) {
            if (book.getBookId().equalsIgnoreCase(searchTerm) || book.getTitle().equalsIgnoreCase(searchTerm)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book is not available.");
        }
    }

    /**
     * Updates book details
     */
    public void updateBook(String bookId, String newTitle, String newAuthor, boolean isAvailable) {
        Book book = bookCollection.get(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (!newTitle.isEmpty()) book.setTitle(newTitle);
        if (!newAuthor.isEmpty()) book.setAuthor(newAuthor);
        book.setAvailable(isAvailable);
        System.out.println("Book updated successfully.");
    }

    /**
     * Deletes a book from the collection
     */
    public void deleteBook(String bookId) {
        if (bookCollection.remove(bookId) != null) {
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
}
