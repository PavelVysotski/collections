package liblary;

import java.util.Iterator;
import java.util.List;

public class Library {


    public static void addBook(List<Book> library, Book book) {
        library.add(book);
    }

    public static void deleteBook(List<Book> library, int index) {
        library.remove(index);
    }

    public static void deleteByAuthor(List<Book> library, String author) {
        Iterator<Book> bookIterator = library.iterator();
        while (bookIterator.hasNext()) {
            Book nextBook = bookIterator.next();
            if (nextBook.getAuthor().equals(author)) {
                bookIterator.remove();
            }
        }
    }

    public static void findByAuthor(List<Book> library, String author) {
        for (Book list : library) {
            if (list.getAuthor().equals(author)) {
                System.out.println(list);
            }
        }
    }

    public static void findByBookName(List<Book> library, String bookName) {
        for (Book list : library) {
            if (list.getBookName().equals(bookName)) {
                System.out.println(list);
            }
        }
    }
    public static void showLibrary (List<Book> library){
        int i = 1;
        for (Book book : library) {
            System.out.println(i + ". " + book);
            i++;
        }
    }
}
