import java.io.FileNotFoundException;
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
            writer.print("event-name,author,score,comment");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    public static void addRating(EventRating eventRating, Event event) {

        String eventName = event.getName().replaceAll("\\s+", "-").toLowerCase();
        PrintWriter writer = null;

        try {
            writer = new PrintWriter("ratings-for-" + eventName + ".csv");

            StringBuilder entry = new StringBuilder();
            entry.append(event.getName());
            entry.append(eventRating.getAuthor());
            entry.append(eventRating.getScore());
            entry.append(eventRating.getComment());

            writer.print(entry.toString());

        } catch (FileNotFoundException e) {
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
