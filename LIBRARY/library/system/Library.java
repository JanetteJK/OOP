package system;
import model.Book;
import model.LibraryMember;


import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;
    List<LibraryMember> members;

    public Library(){
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBooks(Book book){
        books.add(book);

    }

    public void addMembers(LibraryMember member){
        members.add(member);
    }

    public void borrowBook(Book book, LibraryMember member){
        books.remove(book);
        member.addToBorrowed(book);
    }

    public void returnBooks(Book book, LibraryMember member){
        books.add(book);
        member.removeBorrowed(book);

    }
}
