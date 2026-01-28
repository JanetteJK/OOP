import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[]args) {
        Library library = new Library();

        Book book1 = new Book("Blood on Her Tongue", "Johanna van Veen", 1564);
        Book book2 = new Book("Babel", "R.F Kuang", 1365);
        Book book3 = new Book("Why Aaro loved C programming", "Janette Kotanen", 6969);

        LibraryMember mem1 = new LibraryMember("Aaro Saarinen", 123);
        LibraryMember mem2 = new LibraryMember("Red Bull", 556);

        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);

        library.addMembers(mem1);
        library.addMembers(mem2);

        library.borrowBook(book3, mem1);
        library.borrowBook(book1, mem2);
        library.borrowBook(book2, mem1);

        library.returnBooks(book1, mem2);

        library.reserveBook(book2, mem1);
        library.reserveBook(book1, mem1);

        library.displayReservedBooks(mem1);
    }
}