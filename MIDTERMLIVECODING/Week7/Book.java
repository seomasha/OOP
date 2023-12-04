package OOP.MIDTERMLIVECODING.Week7;


import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
Create a library catalog system that manages information about books.
Implement this system using records, optionals, and streams.
The goal is to handle scenarios where a book may or may not be available in the library.

Create a record named Book with fields for the book title, author, publication year, and availability status (boolean).
Create a class named LibraryCatalog that contains a list of books.
Add methods to the catalog to:
Check the availability of a book by title.
Retrieve the details of the first available book by a specific author.
Update the availability status of a book.
Use optionals to handle scenarios where a book may or may not be found.
Utilize streams to filter and process the list of books in the catalog.
Within a main method instantiate the LibraryCatalog and add several books to it.
Test the methods to check availability, retrieve book details, and update availability.
Use optionals and streams for efficient book retrieval and processing.


 */
record Book(String title, String author, int year, boolean availabilityStatus) {
}

class LibraryCatalog{
    private List<Book> books = new ArrayList<>();

    public Optional<Book> checkByAvailabilityByTitle(String title) {
        return books.stream().filter(book1 -> book1.title().equals(title)).findFirst();
    }

    public Optional<Book> receiveFirstBookByAuthor(String author) {
        return books.stream().filter(book -> book.author().equalsIgnoreCase(author)).findFirst();
    }

    public Optional<Book> updateAvailability(String title) {
        return books.stream().filter(book -> book.title().equals(title)).findFirst();
    }

    public void add(Book book) {
        books.add(book);
    }

    public static void main(String[] args) {
        LibraryCatalog libraryCatalog = new LibraryCatalog();
        Book book = new Book("Sead", "Fikro", 2003, true);
        Book book1 = new Book("Zenicki", "Hokage", 2012, false);
        Book book2 = new Book("Lila", "Huseinbegovic", 1901, true);
        Book book3 = new Book("Becir Aga ISakovic", "Hokage", 2012, false);

        libraryCatalog.add(book);
        libraryCatalog.add(book1);
        libraryCatalog.add(book2);

        Optional<Book> availableBook = libraryCatalog.checkByAvailabilityByTitle("Sead");
        availableBook.ifPresentOrElse(
                book4 -> System.out.println("Book available: " + book4),
                () -> System.out.println("Book not available")
        );

        Optional<Book> bookByAuthor = libraryCatalog.receiveFirstBookByAuthor("Hokage");
        bookByAuthor.ifPresentOrElse(
                book5 -> System.out.println("First book by author" + book5),
                () -> System.out.println("No books avilable")
        );


    }
}