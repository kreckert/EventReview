import java.util.Random;

/**
 * Created by ryosukeminami on 08/10/16.
 */
public class Test {

    public static void main(String[] args) {

        EventToCSV.createCSV();

        for (int i = 0; i < 100; i++) {
            Event event = new Event("EVENT" + generateName());
            event.setDate(generateDate());
            event.setLocation("LOC" + generateName());
            event.setCostOfTicket(generateCost());
            event.setOrganizer("ORG" + generateName());
            EventToCSV.addEvent(event);
        }

        CSVParser parser = new CSVParser();

        parser.parseEvents("events.csv");
    }

    public static int generateCost() {

        return (int) Math.floor(Math.random() * 50);
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
