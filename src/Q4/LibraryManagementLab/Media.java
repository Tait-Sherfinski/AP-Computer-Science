package Q4.LibraryManagementLab;

public abstract class Media {
    private String title;
    private String isbn;
    private boolean isCheckedOut;

    public Media(String myTitle, String myIsbn) {
        title = myTitle;
        isbn = myIsbn;
        isCheckedOut = false;
    }

    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }

    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
}
