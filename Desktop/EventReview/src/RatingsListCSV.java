import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ryosukeminami on 08/10/16.
 */
public class RatingsListCSV {

    /**
     * creates new files named eventRatings.csv
     *
     */
    public static void createCSV() {
        try {
            PrintWriter writer = new PrintWriter("eventRatings.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * makes CSV called eventRatings.csv
     * EventName, Author, RatingScore, Comment
     *
     * @param rating
     */
    public static void addEventRating(EventRating rating) {
        StringBuilder entryBuilder = new StringBuilder();
        entryBuilder.append(rating.getEventName() + "," + rating.getAuthor() + "," + rating.getRatingScore() +
                "," + rating.getComment());

        PrintWriter writer = null;

        try {
            writer = new PrintWriter(new FileWriter("eventRatings.csv", true));
            writer.println(entryBuilder.toString());
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
