import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by ryosukeminami on 08/10/16.
 */
public class EventListToCSV {

    public static void createCSV() {
        try {
            PrintWriter writer = new PrintWriter("events.csv");
            writer.print("name,date,costOfTicket,organizer");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void addEntry(Event event) {
        StringBuilder entryBuilder = new StringBuilder();
        entryBuilder.append(event.getName());
        entryBuilder.append(event.getDate());
        entryBuilder.append(event.getCostOfTicket());
        entryBuilder.append(event.getOrganizer());

        try {
            PrintWriter writer = new PrintWriter("events.csv");
            writer.print(entryBuilder.toString());
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
