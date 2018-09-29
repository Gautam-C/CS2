
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String title;
    private int pages;
    private String author;
    private boolean hardcover;
    private double rating;

    /**
     * Creates a hardcover Book with the given title and author with 0 pages and a rating of 0.0
     */
    public Book(String title1, String author1) {
        title = title1;
        author = author1;
        pages = 0;
        hardcover = true;
        rating = 0.0;
    }

    /**
     * Returns the title of the book as a String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the number of pages in the book as an int
     */
    public int getPages() {
        return pages;
    }

    /**
     * Returns the author of the book as a String
     */
    public String getAuthor(){
        return author;
    }

    /**
     * Returns true if the book is hardcover, false if it is not
     */
    public boolean isHardcover() {
        return hardcover;
    }

    /**
     * Returns the rating of the book as a double
     */
    public double getRating() {
        return rating;
    }

    /**
     * Changes the title of the book to the given title
     */
    public void newTitle(String t){
        title = t;
    }

    /**
     * Changes the number of pages in the book to the given value
     */
    public void newPages(int p){
        pages = p;
    }

    /**
     * Changes the author of the book to the given author
     */
    public void newAuthor(String a){
        author = a;
    }

    /**
     * Makes the book hardcover
     */
    public void makeHardcover(){
        hardcover = true;
    }

    /**
     * Makes the book softcover
     */
    public void makeSoftcover(){
        hardcover = false;
    }

    /**
     * Changes the rating of the book to the given rating.
     */
    public void setRating(double r){
        rating = r;
    }
}
