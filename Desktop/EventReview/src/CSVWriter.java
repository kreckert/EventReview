import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author ryosukeminami
 */
public class CSVWriter {

    public static void createCSV() {

        try {
            PrintWriter writer = new PrintWriter("events.csv");
            writer.print("name,");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void addEntry(Event event) {
        StringBuilder entryBuilder = new StringBuilder();
    }

    public static void main(String[] args) {
        createCSV();
        addEntry(null);
    }

}
