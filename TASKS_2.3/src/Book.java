import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int year;
    private double overAllRating;
    private ArrayList<String> reviews;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.overAllRating = 0;
        this.reviews = new ArrayList<>();

    }

    public String  getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setRating(double rating){
        overAllRating = overAllRating + rating;
        System.out.println(rating + " star rating added");
    }

    public void addReview(String review){
        System.out.println("Added review: " + review);
        reviews.add(review);
    }

    public double getRating(){
        return overAllRating;
    }

    public int getReviewAmount(){
        return reviews.size();
    }
}