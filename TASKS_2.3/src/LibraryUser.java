import java.util.ArrayList;

public class LibraryUser {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks;
    Library library = new Library();


    public LibraryUser(String name, int age){
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void getBorrowedBooks(){
        for (Book book : borrowedBooks){
            System.out.println(book.getTitle() + ", " + book.getAuthor());
        }
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }

    public void userReturnBook(Book book){
            borrowedBooks.remove(book);
        }

    }





