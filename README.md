# Library-Management-System--JAVA



## Overview

The Library Management System is a **console-based Java application** that allows librarians to **add, update, search, and remove books** while maintaining their availability status. This system ensures efficient catalog management with a user-friendly interface.

## Features

- **Add a Book**: Enter Book ID, Title, Author, Genre, and Availability Status.
- **View All Books**: Displays all books in the system.
- **Search a Book**: Search by Book ID or Title.
- **Update Book Details**: Modify book information including availability status.
- **Delete a Book**: Remove a book from the system.
- **Duplicate Book ID Handling**: Prevents duplicate Book IDs by prompting the user for a unique one.

## Technology Stack

- **Java** (JDK 8+)
- **Object-Oriented Programming (OOP)** principles
- **Collections Framework (HashMap)** for data storage

## Project Structure

```
LibraryManagementSystem/
     src/
       main/
          Main.java         
       model/
           Book.java         
       service/
           LibraryService.java # Handles book operations
       utils/
            InputValidator.java # Manages user input validation
README.md
.gitignore
```
## Setup Instructions

### **1️⃣ Clone the Repository**

Click the link below to clone the repository:

[Clone the Repository](https://github.com/Akhilapatel25/Library-Management-System--JAVA.git)

Then, run the following command:

```sh
git clone https://github.com/Akhilapatel25/Library-Management-System--JAVA.git

cd Library-Management-System--JAVA

```

### **2️⃣ Compile the Code**

```sh
javac -d bin -cp src src/main/Main.java src/model/Book.java src/service/LibraryService.java src/utils/InputValidator.java
```

### **3️⃣ Run the Application**

```sh
java -cp bin main.Main
```

## Assumptions

- The system stores books in memory (no database integration).
- The user provides valid input where required.
- The application runs in a **single-user mode** without concurrent access.

## Future Improvements

- Implement **file-based storage or database integration**.
- Add **a graphical user interface (GUI)**.
- Implement **user authentication** for different roles (Librarian, Member).
- Add **unit tests** to improve reliability.

##

