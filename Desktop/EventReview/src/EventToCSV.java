import java.io.*;

/**
 * Created by ryosukeminami on 08/10/16.
 */
public class EventToCSV {

    /**
     * new CSV called events.csv
     *
     */
    public static void createCSV() {
        try {
            PrintWriter writer = new PrintWriter("events.csv");
            // writer.println("name,date,location,costOfTicket,organizer");
            // writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * columns:
     * name, date, location, costOfTicket, organizer
     *
     * @param event
     */
    public static void addEvent(Event event) {
        StringBuilder entryBuilder = new StringBuilder();
        entryBuilder.append(event.getName() + "," + event.getDate() + "," + event.getLocation() +
                "," + event.getCostOfTicket() + "," + event.getOrganizer());

        PrintWriter writer = null;

        try {
            writer = new PrintWriter(new FileWriter("events.csv", true));
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
