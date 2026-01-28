package model;

import system.Library;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int id;
    private ArrayList<Book> borrowedBooks;
    private List<Book> reservedBooks;


    public LibraryMember(String name, int id){
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
        this.reservedBooks = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public void getBorrowedBooks(){
        for (Book book : borrowedBooks){
            System.out.println(book.getTitle() + ", " + book.getAuthor());
        }
    }
    public void addBorrowed(Book book){
        borrowedBooks.add(book);
    }

    public void removeBorrowed(Book book) {
        borrowedBooks.remove(book);
    }

    public void addReservedBooks(Book book){
        reservedBooks.add(book);
    }

    public void removeReservedBooks(Book book){
        reservedBooks.remove(book);
    }

    public List<Book> getReservedBooks(){
        return reservedBooks;
        }

    public boolean hasReservedBook(Book book){
        if (reservedBooks.contains(book)){
            return true;
        }else {
            return false;
        }
    }

    public void removeReservedBook(Book book){
        reservedBooks.remove(book);
    }

}
