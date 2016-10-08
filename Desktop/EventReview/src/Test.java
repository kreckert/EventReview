/**
 * Created by ryosukeminami on 08/10/16.
 */
public class Test {

    public static void main(String[] args) {

        /*
        Event hackTheBubble = new Event("Hack the Bubble");
        hackTheBubble.setDate("08-10-2016");
        hackTheBubble.setLocation("Jack Cole");
        hackTheBubble.setCostOfTicket(0);
        hackTheBubble.setOrganizer("STACS");

        EventToCSV.createCSV();
        EventToCSV.addEvent(hackTheBubble);


        CSVParser parser = new CSVParser();

        parser.parseEvents("events.csv");
        */

        for (int i = 0; i < 100; i++) {
            //System.out.println(generateCost());
            System.out.println(generateDate());
        }
    }

    public static int generateCost() {

        return (int) Math.floor(Math.random() * 50);
    }

    public static String generateDate() {

        int day = (int) Math.floor(Math.random() * 30) + 1;
        int month = (int) Math.floor(Math.random() * 12) + 1;

        return day + "-" + month + "-" + "2016";
    }
}
