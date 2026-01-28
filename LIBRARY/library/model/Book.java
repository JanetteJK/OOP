package model;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean reserved = false;


    public Book(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getIsbn(){
        return this.isbn;
    }

    public boolean isReserved(){
        return reserved;
    }
    public void setReserved(boolean rs){
        reserved = rs;
    }

}
