import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ryosukeminami on 08/10/16.
 */
public class RatingsListCSV {

    public static void createCSVForEvent(Event event) {

        String eventName = event.getName().replaceAll("\\s+", "-").toLowerCase();
        PrintWriter writer = null;

        try {
            writer = new PrintWriter("ratings-for-" + eventName + ".csv");
            writer.println("event-name,author,score,comment");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    public static void addRating(EventRating rating) {

        String eventName = rating.getEventName().replaceAll("\\s+", "-").toLowerCase();
        PrintWriter writer = null;

        try {
            writer = new PrintWriter(new FileWriter("ratings-for-" + eventName + ".csv", true));

            StringBuilder entry = new StringBuilder();
            entry.append(rating.getEventName());
            entry.append(rating.getAuthor());
            entry.append(rating.getRatingScore());
            entry.append(rating.getComment());

            writer.println(entry.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    public static void main(String[] args) {
        Event hackTheBubble = new Event("Hack the Bubble");
        createCSVForEvent(hackTheBubble);
    }
}
