package org.testleaf.week2.day1;

public class Library {
    
        public String addBook(String bookTitle) {

        System.out.println("Book added successfully");
        return bookTitle;
    }
    public void issueBook() {

        System.out.println("Book issued successfully");
    }

    // Main method
    public static void main(String[] args) {

        // Create object for Library class
        Library obj = new Library();

        // Call methods
        String title = obj.addBook("Java Programming");
        System.out.println("Book Title: " + title);

        obj.issueBook();
    }
}

