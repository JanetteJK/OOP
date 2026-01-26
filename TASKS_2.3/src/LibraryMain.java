public class LibraryMain {
    public static void main(String[]args ){
        Library library = new Library();

        Book book1 = new Book("Pride and Prejudice", "Jane Austen", 1813);
        Book book2 = new Book("Blood On Her Tongue", "Johanna Van Veen", 2025);
        Book book3 = new Book("Babel", "R.F Kuang", 2022);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.findBooksByAuthor("Johanna Van Veen");


        library.isBookAvailable("Pride and Prejudice");

        book2.setRating(5.0);
        book3.setRating(4.5);
        book1.setRating(4.9);
        book1.setRating(3.5);

        book2.addReview("One of the greatest books I read during the entirety of last year! Highly recommend");

        LibraryUser user1 = new LibraryUser("Janette", 31);

        library.addUsers(user1);

        library.borrowBook("Babel", user1);

        library.getUsers();

        library.returnBook(book3, user1);





    }
}
