package liblary;

import java.util.Objects;

public class Book {

    private String author;
    private String bookName;


    public Book(String author, String bookName) {
        this.author = author;
        this.bookName = bookName;
    }

    public static Book createNewBook(String author, String bookName) {
        return new Book(author, bookName);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName);
    }

    @Override
    public String toString() {
        return "Автор: " + author + ", название книги: " + "\""+bookName+"\"" + ".";
    }
}
