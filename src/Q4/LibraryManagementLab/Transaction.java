package Q4.LibraryManagementLab;

public class Transaction {
    private String isbn;
    private String patronId;
    private String checkoutDate; // Simple date format
    private String returnDate; // Optional, can be null if not returned yet

    public Transaction(String myIsbn, String myPatronId, String myCheckoutDate) {
        isbn = myIsbn;
        patronId = myPatronId;
        checkoutDate = myCheckoutDate;
        returnDate = null;
    }

    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }
    public String getIsbn() { return isbn; }

    public void setPatronId(String newId) {patronId = newId; }
    public String getPatronId() { return patronId; }

    public void setCheckoutDate(String newDate) {checkoutDate = newDate; }
    public String getCheckoutDate() { return checkoutDate; }

    @Override
    public String toString() {
        return "Transaction{" +
                "isbn='" + isbn + '\'' +
                ", patronId='" + patronId + '\'' +
                ", checkoutDate='" + checkoutDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
