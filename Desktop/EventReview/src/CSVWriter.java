import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author ryosukeminami
 */
public class CSVWriter {

    public static void createCSV() {



        try {
            PrintWriter writer = new PrintWriter("events.csv");
            writer.print("name,rating,numOfRatings,friendsGoing,costOfTicket,organizer");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void addEntry(Event event) {
        StringBuilder entryBuilder = new StringBuilder();
        entryBuilder.append(event.getName());
    }

    public static void main(String[] args) {
        createCSV();
        // addEntry(null);
    }

}
