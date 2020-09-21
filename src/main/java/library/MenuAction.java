package library;

import java.util.ArrayList;
import java.util.List;

public class MenuAction {



    public static void worker() {
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

        boolean mainLoop = true;
        while (mainLoop) {
            MenuText.mainMenu();
            int menuChoice = CommandReader.readNumber("Введите номер необходимого действия: ");
            switch (menuChoice) {
                case 1:
                    Library.showLibrary(library);
                    break;
                case 2:
                    String author = CommandReader.readString("Введите автора книги.");
                    Library.findByAuthor(library, author);
                    break;
                case 3:
                    String bookName = CommandReader.readString("Введите название книги.");
                    Library.findByBookName(library, bookName);
                    break;
                case 4:
                    String newAuthor = CommandReader.readString("Введите автора книги.");
                    String newBook = CommandReader.readString("Введите название книги.");
                    Book book = Book.createNewBook(newAuthor, newBook);
                    Library.addBook(library, book);
                    Library.showLibrary(library);
                    break;
                case 5:
                    Library.showLibrary(library);
                    int index = CommandReader.readNumber("Введите номер книги.");
                    Library.deleteBook(library, index);
                    Library.showLibrary(library);
                    break;
                case 6:
                    Library.showLibrary(library);
                    String deleteAuthor = CommandReader.readString("Введите автора книги, которые надо удалить.");
                    Library.deleteByAuthor(library, deleteAuthor);
                    Library.showLibrary(library);
                    break;
                case 7:
                    mainLoop = false;
                    break;
                default:
                    System.out.println("Такого номера нет, повторите Ваш выбор:");
            }
        }
    }
}
