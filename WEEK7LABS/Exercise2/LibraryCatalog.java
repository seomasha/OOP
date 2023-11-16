package OOP.WEEK7LABS.Exercise2;

import java.util.ArrayList;
import java.util.Optional;

public class LibraryCatalog {
    ArrayList<Book> listOfBooks = new ArrayList<>();

    public LibraryCatalog(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public Optional<Book> availabilityOfABook(String name) {
        return listOfBooks.stream().filter(book -> book.bookTitle().equalsIgnoreCase(name)).findFirst();
    }

    public Optional<Book> getFirstAvailableBookDetailsByAuthor(String name) {
        return listOfBooks.stream().filter(book -> book.author().equalsIgnoreCase(name) && book.availabilityStatus()).findFirst();
    }

    public Optional<Book> updateAvailability(String title, boolean availability) {
        for(Book book : listOfBooks) {
            if(book.bookTitle().equals(title)) {
                Book newBook = new Book(book.bookTitle(), book.author(), book.publicationYear(), availability);
                return Optional.ofNullable(newBook);
            }
        }
        return Optional.ofNullable(null);
    }
}
