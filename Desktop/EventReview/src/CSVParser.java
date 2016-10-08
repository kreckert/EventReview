import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by td41 on 08/10/16.
 */
public class CSVParser {

    private Map<String,Event> events; //String is Event Name, Event name is unique
    private Map<String,EventRating> ratings;//String is Event Name, Event name is unique
    private BufferedReader bufferedReader;


    public CSVParser() {
        events = new HashMap<>();
        ratings = new HashMap<>();
    }

    /**
     * Parses a csv file which includes all the events
     *
     * @param eventCSVFile the csv file
     * @return Returns all the events in a arrayList
     */
    public Map<String,Event> parseEvents(String eventCSVFile) {
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

                    events.put(name,event);
                }
            } catch (IOException | IllegalArgumentException e) {
                e.printStackTrace();
            }
            return events;
        }
        return null;
    }

    /**
     * Parses a csv file which includes all the ratings
     *
     * @param ratingsCSVFile the csv file
     * @return Returns all the events in a arrayList
     */
    public List<EventRating> parseEventRatings(String ratingsCSVFile) {
        if (ratingsCSVFile != null) {
            String line;


            try {
                bufferedReader = new BufferedReader(new FileReader(ratingsCSVFile));
                while ((line = bufferedReader.readLine()) != null) {

                    List<String> eventAttributes = Arrays.asList(line.split("\\s*,\\s*"));
                    String eventName = eventAttributes.get(0);
                    String author = eventAttributes.get(1);
                    int score = Integer.valueOf(eventAttributes.get(2));
                    String comment = eventAttributes.get(3);

                    EventRating rating = new EventRating(score,author,comment);

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
