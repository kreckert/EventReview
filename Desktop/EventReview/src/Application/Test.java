package Application;

import java.util.Random;

/**
 * Created by ryosukeminami on 08/10/16.
 */
public class Test {

    private static EventListWrapper eventListWrapper;

    public static void main(String[] args) {

        eventListWrapper = new EventListWrapper();
        fillCSVFiles();
    }

    /**
     * generates a price
     *
     * @return
     */
    public static int generateCost() {

        return (int) Math.floor(Math.random() * 50);
    }

    /**
     * 0-10
     *
     * @return
     */
    public static int generateRating() {

        return (int) Math.floor(Math.random() * 11);
    }

    /**
     * any month in 2016
     *
     * @return
     */
    public static String generateDate() {

        int day = (int) Math.floor(Math.random() * 30) + 1;
        int month = (int) Math.floor(Math.random() * 12) + 1;

        return day + "-" + month + "-" + "2016";
    }

    /**
     * any random 5 characters
     *
     * @return
     */
    public static String generateName() {

        Random r = new Random();
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        String returnString = "";
        for (int i = 0; i < 5; i++) {
            returnString = returnString + alphabet.charAt(r.nextInt(alphabet.length()));
        }
        return returnString;
    }

    /**
     * calls all generators and uses eventlistWrapper
     */
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
