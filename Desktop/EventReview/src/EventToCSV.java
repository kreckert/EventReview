import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by ryosukeminami on 08/10/16.
 */
public class EventToCSV {

    public static void createCSV() {
        try {
            PrintWriter writer = new PrintWriter("events.csv");
            writer.print("name,date,costOfTicket,organizer");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void addEvent(Event event) {
        StringBuilder entryBuilder = new StringBuilder();
        entryBuilder.append(event.getName());
        entryBuilder.append(event.getDate());
        entryBuilder.append(event.getCostOfTicket());
        entryBuilder.append(event.getOrganizer());

        PrintWriter writer = null;

        try {
            writer = new PrintWriter("events.csv");
            writer.print(entryBuilder.toString());
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}