package OOP.WEEK6LABS.LibraryInformationSIS;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {
        for(Book book : books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> newBooks = new ArrayList<>();

        for(Book book : books) {
            if(StringUtils.included(book.title(), title)) {
                newBooks.add(book);
            }
        }

        return newBooks;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> newBooks = new ArrayList<>();

        for(Book book : books) {
            if(StringUtils.included(book.publisher(), publisher)) {
                newBooks.add(book);
            }
        }

        return newBooks;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> newBooks = new ArrayList<>();

        for(Book book : books) {
            if(book.year() == year) {
                newBooks.add(book);
            }
        }

        return newBooks;
    }

}
