import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by ryosukeminami on 08/10/16.
 */
public class Test {

    private static EventListWrapper eventListWrapper;

    public static void main(String[] args) {

        /*
        CSVParser parser = new CSVParser();
        Map<String,Event> events = parser.parseEvents("events.csv");
        ArrayList<EventRating> ratings = parser.parseEventRatings("eventRatings.csv");
        events = parser.assignRatingsToEvents(events, ratings)
         */

        eventListWrapper = new EventListWrapper();
        fillCSVFiles();
    }

    public static int generateCost() {

        return (int) Math.floor(Math.random() * 50);
    }

    public static int generateRating() {

        return (int) Math.floor(Math.random() * 11);
    }

    public static String generateDate() {

        int day = (int) Math.floor(Math.random() * 30) + 1;
        int month = (int) Math.floor(Math.random() * 12) + 1;

        return day + "-" + month + "-" + "2016";
    }

    public static String generateName() {

        Random r = new Random();
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        String returnString = "";
        for (int i = 0; i < 5; i++) {
            returnString = returnString + alphabet.charAt(r.nextInt(alphabet.length()));
        }
        return returnString;
    }

    public static void fillCSVFiles() {

        for (int i = 0; i < 100; i++) {

            //creates random event

            String name = "EVENT" + generateName();
            String date = generateDate();
            String location = "LOC" + generateName();
            int ticketCost = generateCost();
            String organizer = "ORG" + generateName();

            eventListWrapper.addEvent(name, date, location, ticketCost, organizer);

            //creates random event rating
            for (int j = 0; j < 100; j++) {

                String author = "AUTH" + generateName();
                int rating = generateRating();
                String comment = "COM" + generateName();

                eventListWrapper.addRating(name, author, rating, comment);

            }
        }
    }
}
