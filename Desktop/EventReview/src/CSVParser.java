import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by td41 on 08/10/16.
 */
public class CSVParser {

    private List<Event> events;
    private List<EventRating> ratings;
    private BufferedReader bufferedReader;


    public CSVParser(String pathToCSV) {
        events = new ArrayList<>();
        ratings = new ArrayList<>();
    }

    public List<Event> parseEvents(String eventCSVFile) {
        if (eventCSVFile != null) {
            String line,name,date,organizer;
            float costOfTicket;


            try {
                bufferedReader = new BufferedReader(new FileReader(eventCSVFile));
                while ((line = bufferedReader.readLine()) != null) {

                    List<String> eventAttributes = Arrays.asList(line.split("\\s*,\\s*"));
                    name = eventAttributes.get(0);
                    date = eventAttributes.get(1);
                    costOfTicket = Float.valueOf(eventAttributes.get(2));

                }
            } catch (IOException | IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }
}
