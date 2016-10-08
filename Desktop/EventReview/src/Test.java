import java.util.Random;

/**
 * Created by ryosukeminami on 08/10/16.
 */
public class Test {

    public static void main(String[] args) {

        EventToCSV.createCSV();
        RatingsListCSV.createCSV();

        for (int i = 0; i < 100; i++) {

            //creates random event
            String eventName = "EVENT" + generateName();
            Event event = new Event(eventName);
            event.setDate(generateDate());
            event.setLocation("LOC" + generateName());
            event.setCostOfTicket(generateCost());
            event.setOrganizer("ORG" + generateName());
            EventToCSV.addEvent(event);

            //creates random event rating
            for (int j = 0; j < 100; j++) {

                EventRating eventRating = new EventRating(eventName, "AUTH" + generateName(),
                       generateRating() , "COM" + generateName());
                RatingsListCSV.addEventRating(eventRating);

            }
        }

        CSVParser parser = new CSVParser();

        parser.parseEvents("events.csv");
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
}
