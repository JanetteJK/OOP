import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<LibraryUser> users = new ArrayList<>();

    public void addUsers(LibraryUser user){
        users.add(user);
    }

    public void getUsers(){
        System.out.println("Library users: ");
        for (LibraryUser user : users) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge() + ", Books borrowed: ");
            user.getBorrowedBooks();

        }
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in the library: ");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Published: " + book.getYear() + ".");
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Books by Author" + author + "\nTitle: " + book.getTitle() + ", Published: " + book.getYear());
            }
        }
    }


    public void borrowBook(String title, LibraryUser user) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println(user.getName() +" borrowed " + title + ".");
                user.borrowBook(book);
                return;
            }
        }
        System.out.println("Title " + title + " not in library.");

    }

    public void returnBook(Book book, LibraryUser user) {
        System.out.println("Returned " + book.getTitle() + " to the library.");
        user.userReturnBook(book);
        books.add(book);
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().contains(title)) {
                System.out.println(title + " is available.");
                return true;
            }
        }
        System.out.println(title + " not available.");
        return false;
    }

    public void getAverageBookRating() {
        double holder = 0;
        for (Book book : books) {
            double rate = book.getRating();
            holder = holder + rate;
        }
        double average = holder / books.size();
        System.out.println("The library has an average book rating of " + average + " stars!");
    }

    public void getMostReviewedBook() {
        Book mostReviews = books.get(0);
        for (Book book : books) {
            if (book.getReviewAmount() > mostReviews.getReviewAmount()) {
                mostReviews = book;
            }
        }
        System.out.println(mostReviews.getTitle() + " by " + mostReviews.getAuthor() + " has the most reviews.");
    }
}
