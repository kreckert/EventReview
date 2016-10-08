/**
 * Created by ryosukeminami on 08/10/16.
 */
public class Test {

    public static void main(String[] args) {
        Event hackTheBubble = new Event("Hack the Bubble");
        hackTheBubble.setDate("08-10-2016");
        hackTheBubble.setCostOfTicket(0);
        hackTheBubble.setOrganizer("STACS");

        EventToCSV.createCSV();
        EventToCSV.addEvent(hackTheBubble);


        CSVParser parser = new CSVParser();

        parser.parseEvents("events.csv");
    }
}
