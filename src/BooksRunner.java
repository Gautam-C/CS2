
/**
 * Write a description of class BooksRunner here.
 *
 * @author (Gautam Chasmawala)
 * @version (15092018)
 */
public class BooksRunner
{
    public static void main (String [] args) {

        //All the Books
        Book bioText = new Book("Biology", "Campbell and Reenes");
        Book apBioText = new Book("Principles of Life", "StandIn");
        Book apBioPrep = new Book("AP Biology Prep", "Barrons");
        Book apush = new Book("American Colonies", "Alan Taylor");
        Book bookRunner = new Book("BookRunner", "Jamie Lang");

        //Make Softcover
        apBioPrep.makeSoftcover();
        apush.makeSoftcover();
        bookRunner.makeSoftcover();

        //Pages
        bioText.newPages(1000);
        apBioText.newPages(908);
        apBioPrep.newPages(200);
        apush.newPages(400);
        bookRunner.newPages(2);

        //Ratings
        bioText.setRating(5);
        apBioText.setRating(4.9);
        apBioPrep.setRating(4.9);
        apush.setRating(4.8);
        bookRunner.setRating(5);

        //Print out information
        System.out.println(bioText.getTitle() + " by " + bioText.getAuthor() + " - " + bioText.getPages() + " pages. Rating: " + bioText.getRating() + ". Is Hardcover? " + bioText.isHardcover());
        System.out.println(apBioText.getTitle() + " by " + apBioText.getAuthor() + " - " + apBioText.getPages() + " pages. Rating: " + apBioText.getRating() + ". Is Hardcover? " + apBioText.isHardcover());
        System.out.println(apBioPrep.getTitle() + " by " + apBioPrep.getAuthor() + " - " + apBioPrep.getPages() + " pages. Rating: " + apBioPrep.getRating() + ". Is Hardcover? " + apBioPrep.isHardcover());
        System.out.println(apush.getTitle() + " by " + apush.getAuthor() + " - " + apush.getPages() + " pages. Rating: " + apush.getRating() + ". Is Hardcover? " + apush.isHardcover());
        System.out.println(bookRunner.getTitle() + " by " + bookRunner.getAuthor() + " - " + bookRunner.getPages() + " pages. Rating: " + bookRunner.getRating() + ". Is Hardcover? " + bookRunner.isHardcover());

        //Line Break
        System.out.println(System.lineSeparator());

        //Pages rev2
        bioText.newPages(5);
        apBioText.newPages(8);
        apBioPrep.newPages(10);
        apush.newPages(1);
        bookRunner.newPages(2);

        //Print v2
        System.out.println(bioText.getTitle() + " - " + bioText.getPages() + " pages");
        System.out.println(apBioText.getTitle() + " - " + apBioText.getPages() + " pages");
        System.out.println(apBioPrep.getTitle() + " - " + apBioPrep.getPages() + " pages");
        System.out.println(apush.getTitle() + " - " + apush.getPages() + " pages");
        System.out.println(bookRunner.getTitle() + " - " + bookRunner.getPages() + " pages");

        //Line Break v2
        System.out.println(System.lineSeparator());

        //Change Genotype
        if (bioText.isHardcover()) {

            bioText.makeSoftcover();

        } else {

            bioText.makeHardcover();

        }

        if (apBioText.isHardcover()) {

            apBioText.makeSoftcover();

        } else {

            apBioText.makeHardcover();

        }

        if (apBioPrep.isHardcover()) {

            apBioPrep.makeSoftcover();

        } else {

            apBioPrep.makeHardcover();

        }

        if (apush.isHardcover()) {

            apush.makeSoftcover();

        } else {

            apush.makeHardcover();

        }

        if (bookRunner.isHardcover()) {

            bookRunner.makeSoftcover();

        } else {

            bookRunner.makeHardcover();

        }

        //Print v3
        System.out.println(bioText.getTitle() + " by " + bioText.getAuthor() + " - " + bioText.getPages() + " pages. Rating: " + bioText.getRating() + ". Is Hardcover? " + bioText.isHardcover());
        System.out.println(apBioText.getTitle() + " by " + apBioText.getAuthor() + " - " + apBioText.getPages() + " pages. Rating: " + apBioText.getRating() + ". Is Hardcover? " + apBioText.isHardcover());
        System.out.println(apBioPrep.getTitle() + " by " + apBioPrep.getAuthor() + " - " + apBioPrep.getPages() + " pages. Rating: " + apBioPrep.getRating() + ". Is Hardcover? " + apBioPrep.isHardcover());
        System.out.println(apush.getTitle() + " by " + apush.getAuthor() + " - " + apush.getPages() + " pages. Rating: " + apush.getRating() + ". Is Hardcover? " + apush.isHardcover());
        System.out.println(bookRunner.getTitle() + " by " + bookRunner.getAuthor() + " - " + bookRunner.getPages() + " pages. Rating: " + bookRunner.getRating() + ". Is Hardcover? " + bookRunner.isHardcover());

        //Line Break v3
        System.out.println(System.lineSeparator());

        //Set Titles v2
        bioText.newTitle("Why");
        apBioText.newTitle("Is");
        apBioPrep.newTitle("This");
        apush.newTitle("Necessary");
        bookRunner.newTitle("At All?");

        //Set Authors v2
        bioText.newAuthor("The");
        apBioText.newAuthor("authors");
        apBioPrep.newAuthor("quit");
        apush.newAuthor("their");
        bookRunner.newAuthor("jobs.");

        //Set Ratings v2
        bioText.setRating(1);
        apBioText.setRating(0);
        apBioPrep.setRating(0);
        apush.setRating(1);
        bookRunner.setRating(1);

        //Print v4
        System.out.println(bioText.getTitle() + " by " + bioText.getAuthor() + " - " + bioText.getPages() + " pages. Rating: " + bioText.getRating() + ". Is Hardcover? " + bioText.isHardcover());
        System.out.println(apBioText.getTitle() + " by " + apBioText.getAuthor() + " - " + apBioText.getPages() + " pages. Rating: " + apBioText.getRating() + ". Is Hardcover? " + apBioText.isHardcover());
        System.out.println(apBioPrep.getTitle() + " by " + apBioPrep.getAuthor() + " - " + apBioPrep.getPages() + " pages. Rating: " + apBioPrep.getRating() + ". Is Hardcover? " + apBioPrep.isHardcover());
        System.out.println(apush.getTitle() + " by " + apush.getAuthor() + " - " + apush.getPages() + " pages. Rating: " + apush.getRating() + ". Is Hardcover? " + apush.isHardcover());
        System.out.println(bookRunner.getTitle() + " by " + bookRunner.getAuthor() + " - " + bookRunner.getPages() + " pages. Rating: " + bookRunner.getRating() + ". Is Hardcover? " + bookRunner.isHardcover());

        //Line Break v4
        System.out.println(System.lineSeparator());

        //Average rating
        System.out.println("Average Rating : " + ((bioText.getRating() + apBioText.getRating() + apBioPrep.getRating() + apush.getRating() + bookRunner.getRating())/5));

        //Total Pages
        System.out.println("Total Pages : " + (bioText.getPages() + apBioText.getPages() + apBioPrep.getPages() + apush.getPages() + bookRunner.getPages()));

        //Setup Soft and Hard variables
        int hard = 0;
        int soft = 0;

        //Count number of soft and hard books
        if (bioText.isHardcover()) {
            hard++;
        } else {
            soft++;
        }

        if (apBioText.isHardcover()) {
            hard++;
        } else {
            soft++;
        }

        if (apBioPrep.isHardcover()) {
            hard++;
        } else {
            soft++;
        }

        if (apush.isHardcover()) {
            hard++;
        } else {
            soft++;
        }

        if (bookRunner.isHardcover()) {
            hard++;
        } else {
            soft++;
        }

        //Print number of soft and hard cover books
        System.out.println("Number of Hardcover : " + hard);
        System.out.println("Number of Softcover : " + soft);


    }
}
