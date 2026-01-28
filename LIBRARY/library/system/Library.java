package system;
import model.Book;
import model.LibraryMember;


import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;
    List<LibraryMember> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBooks(Book book) {
        books.add(book);

    }

    public void addMembers(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(Book book, LibraryMember member) {
        System.out.println(member.getName() + " borrowed book titled: " + book.getTitle() + ", by " + book.getAuthor() + ", with ISBN of " + book.getIsbn());
        books.remove(book);
        member.addBorrowed(book);
    }


    public void returnBooks(Book book, LibraryMember member) {
        System.out.println(member.getName() + " returned book " + book.getTitle() + ", by " + book.getAuthor() + ", with ISBN of " + book.getIsbn());
        books.add(book);
        member.removeBorrowed(book);

    }

    public void reserveBook(Book book, LibraryMember member) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBooks(book);
            System.out.println(member.getName() + " reserved book " + book.getTitle());
        } else {
            System.out.println("Book is already reserved");
        }
    }

    public void cancelReservation(Book book, LibraryMember member) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Book cancellation successful");
        } else {
            System.out.println("Book not reserved by this member");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println(member.getName() + " has reserved books: ");
        for (Book book : member.getReservedBooks()){
            System.out.println(book.getTitle());
        }

    }
}
