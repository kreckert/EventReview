import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by ryosukeminami on 08/10/16.
 */
public class RatingsListToCSV {

    public static void createCSV(Event event) {

        String eventName = event.getName().replaceAll("\\s+", "-").toLowerCase();

        try {
            PrintWriter writer = new PrintWriter("ratings-for-" + eventName + ".csv");
            writer.print("name,rating,comment");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Event hackTheBubble = new Event("Hack the Bubble");
        createCSV(hackTheBubble);
    }
}
