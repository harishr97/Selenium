package org.testleaf.week2.day1;

public class LibraryManagement {
    public static void main(String[] args) {

        // Create object for Library class
        Library obj = new Library();

        // Call methods from Library class
        String title = obj.addBook("Python Basics");
        System.out.println("Book Title: " + title);

        obj.issueBook();
    }


}
