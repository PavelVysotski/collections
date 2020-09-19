package liblary;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Book b1 = Book.createNewBook("Теодор Драйзер", "Финансист");
        Book b2 = Book.createNewBook("Теодор Драйзер", "Титан");
        Book b3 = Book.createNewBook("Теодор Драйзер", "Стоик");
        Book b4 = Book.createNewBook("Никколо Макиавелли", "Государь");
        Book b5 = Book.createNewBook("Брюс Эккель", "Философия Java");

        List<Book> library = new ArrayList<>();

        Library.addBook(library, b1);
        Library.addBook(library, b2);
        Library.addBook(library, b3);
        Library.addBook(library, b4);
        Library.addBook(library, b5);

        Library.showLibrary(library);

        Library.findByAuthor(library, "Никколо Макиавелли");

        Library.findByBookName(library, "Философия Java");


    }
}

