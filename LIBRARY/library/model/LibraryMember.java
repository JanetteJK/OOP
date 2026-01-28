package model;

import system.Library;

import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private int id;
    private ArrayList<Book> borrowedBooks;

    public LibraryMember(String name, int id){
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();

    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void getBorrowedBooks(){
        for (Book book : borrowedBooks){
            System.out.println(book.getTitle() + ", " + book.getAuthor());
        }


    }
    public void addToBorrowed(Book book){
        System.out.println("Borrowed book " + book);
        borrowedBooks.add(book);
    }

    public void removeBorrowed(Book book) {
        System.out.println("Returned " + book + " to library");
        borrowedBooks.remove(book);
    }
}
