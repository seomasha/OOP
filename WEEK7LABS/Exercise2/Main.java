package OOP.WEEK7LABS.Exercise2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("OOP", "Becir Isakovic", 2023, true);
        Book book2 = new Book("Discrete Math", "Dino Keco", 2022, false);
        Book book3 = new Book("Computer Networks", "Elma Avdic", 2015, true);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        LibraryCatalog catalog = new LibraryCatalog(books);

        System.out.println(catalog.availabilityOfABook("OOP"));
        System.out.println(catalog.getFirstAvailableBookDetailsByAuthor("Dino Keco"));
        catalog.updateAvailability("Computer Networks", false);
        System.out.println(catalog.availabilityOfABook("Computer Networks"));
    }
}
