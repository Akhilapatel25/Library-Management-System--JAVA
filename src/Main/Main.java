package main;  // Declares this class is inside the 'main' package

import model.Book;
import service.LibraryService;
import utils.InputValidator;

/**
 * Main class - Entry point of the Library Management System
 */
public class Main {
    private static final LibraryService libraryService = new LibraryService(); // Service to manage books

    public static void main(String[] args) {
        while (true) {
            // Display the menu
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID or Title");
            System.out.println("4. Update Book Details");
            System.out.println("5. Delete a Book Record");
            System.out.println("6. Exit");

            // Get user choice
            int choice = InputValidator.getIntegerInput("Enter your choice: ");

            switch (choice) {
                case 1 -> addBook();  // Call method to add book
                case 2 -> libraryService.viewAllBooks();  // Display all books
                case 3 -> {
                    String searchTerm = InputValidator.getStringInput("Enter Book ID or Title to search: ");
                    libraryService.searchBook(searchTerm);  // Search for a book
                }
                case 4 -> {  
                    // Update book details
                    String bookId = InputValidator.getStringInput("Enter Book ID to update: ");
                    String newTitle = InputValidator.getStringInput("Enter new title (or press enter to keep current): ");
                    String newAuthor = InputValidator.getStringInput("Enter new author (or press enter to keep current): ");
                    boolean isAvailable = InputValidator.getBooleanInput("Is the book available? (true/false): ");
                    libraryService.updateBook(bookId, newTitle, newAuthor, isAvailable);
                }
                case 5 -> {  
                    // Delete book
                    String bookId = InputValidator.getStringInput("Enter Book ID to delete: ");
                    libraryService.deleteBook(bookId);
                }
                case 6 -> {
                    System.out.println("Exiting the system.");
                    return;
                }
                default -> System.out.println("Invalid choice. Please enter a number between 1-6.");
            }
        }
    }

    /**
     * Adds a book to the library
     */
    private static void addBook() {
        while (true) {
            String bookId = InputValidator.getStringInput("Enter Book ID: ");
            if (libraryService.bookExists(bookId)) {
                System.out.println("Book ID already exists. Please enter a unique ID.");
                continue; // Ask for another Book ID
            }

            String title = InputValidator.getStringInput("Enter Title: ");
            String author = InputValidator.getStringInput("Enter Author: ");
            String genre = InputValidator.getStringInput("Enter Genre: ");
            boolean isAvailable = InputValidator.getBooleanInput("Is the book available? (true/false): ");

            libraryService.addBook(new Book(bookId, title, author, genre, isAvailable)); // Add the book to the system
            break;
        }
    }
}
