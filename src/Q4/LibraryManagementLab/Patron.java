package Q4.LibraryManagementLab;

import java.util.ArrayList;

public class Patron {
    private String name;
    private String patronId;
    private ArrayList<Book> checkedOutBooks;

    public Patron(String myName, String myPatronId) {
        name = myName;
        patronId = myPatronId;
    }

    // Basic getters
    public String getName() { return name; }
    public String getPatronId() { return patronId; }

    public void checkInBook(Book book) {
        checkedOutBooks.remove(book);
        book.setCheckedOut(false);
    }
    public void checkOutBook(Book book) {
        checkedOutBooks.add(book);
        book.setCheckedOut(true);
    }
}
