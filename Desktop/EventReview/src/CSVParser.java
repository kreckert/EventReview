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

    /**
     * Parses a csv file which includes all the events
     *
     * @param eventCSVFile the csv file
     * @return Returns all the events in a arrayList
     */
    public List<Event> parseEvents(String eventCSVFile) {
        if (eventCSVFile != null) {
            String line, name, date, organizer;
            int costOfTicket;

            try {
                bufferedReader = new BufferedReader(new FileReader(eventCSVFile));
                while ((line = bufferedReader.readLine()) != null) {

                    List<String> eventAttributes = Arrays.asList(line.split("\\s*,\\s*"));
                    name = eventAttributes.get(0);
                    date = eventAttributes.get(1);
                    costOfTicket = Integer.valueOf(eventAttributes.get(2));
                    organizer = eventAttributes.get(3);

                    Event event = new Event(name);
                    event.setDate(date);
                    event.setCostOfTicket(costOfTicket);
                    event.setOrganizer(organizer);

                    events.add(event);
                }
            } catch (IOException | IllegalArgumentException e) {
                e.printStackTrace();
            }
            return events;
        }
        return null;
    }

    /**
     * Parses a csv file which includes all the events
     *
     * @param eventCSVFile the csv file
     * @return Returns all the events in a arrayList
     */
    /*public List<Event> parseEvents(String eventCSVFile) {
        if (eventCSVFile != null) {
            String line, name, date, organizer;
            int costOfTicket;

            try {
                bufferedReader = new BufferedReader(new FileReader(eventCSVFile));
                while ((line = bufferedReader.readLine()) != null) {

                    List<String> eventAttributes = Arrays.asList(line.split("\\s*,\\s*"));
                    name = eventAttributes.get(0);
                    date = eventAttributes.get(1);
                    costOfTicket = Integer.valueOf(eventAttributes.get(2));
                    organizer = eventAttributes.get(3);

                    Event event = new Event(name);
                    event.setDate(date);
                    event.setCostOfTicket(costOfTicket);
                    event.setOrganizer(organizer);

                    events.add(event);
                }
            } catch (IOException | IllegalArgumentException e) {
                e.printStackTrace();
            }
            return events;
        }
        return null;
    }
*/
}
