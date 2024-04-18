package Q4.LibraryManagementLab;

public class Book extends Media{
    private String author;

    public Book(String title, String isbn, String myAuthor) {
        super(title, isbn);
        author = myAuthor;
    }

    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
