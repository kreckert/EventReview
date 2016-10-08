import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by td41 on 08/10/16.
 */
public class CSVParser {

    private Map<String,Event> events; //String is Event Name, Event name is unique
    private ArrayList<EventRating> ratings;//String is Event Name, Event name is unique
    private BufferedReader bufferedReader;


    public CSVParser() {
        events = new HashMap<>();
        ratings = new ArrayList<>();
    }

    /**
     * Parses a csv file which includes all the events
     *
     * @param eventCSVFile the csv file
     * @return Returns all the events in a hashMap
     */
    public Map<String,Event> parseEvents(String eventCSVFile) {
        if (eventCSVFile != null) {
            String line, name, date, location, organizer;
            int costOfTicket;

            try {
                bufferedReader = new BufferedReader(new FileReader(eventCSVFile));
                while ((line = bufferedReader.readLine()) != null) {

                    List<String> eventAttributes = Arrays.asList(line.split("\\s*,\\s*"));
                    name = eventAttributes.get(0);
                    date = eventAttributes.get(1);
                    location = eventAttributes.get(2);
                    costOfTicket = Integer.valueOf(eventAttributes.get(3));
                    organizer = eventAttributes.get(4);

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
     * @return Returns all the ratings in a arrayList
     */
    public ArrayList<EventRating> parseEventRatings(String ratingsCSVFile) {
        if (ratingsCSVFile != null) {
            String line;


            try {
                bufferedReader = new BufferedReader(new FileReader(ratingsCSVFile));
                while ((line = bufferedReader.readLine()) != null) {

                    List<String> eventAttributes = Arrays.asList(line.split("\\s*,\\s*"));  //Parse Line

                    String eventName = eventAttributes.get(0);
                    String author = eventAttributes.get(1);
                    int score = Integer.valueOf(eventAttributes.get(2));
                    String comment = eventAttributes.get(3);

                    EventRating rating = new EventRating(eventName,author,score,comment);   //Create EventRating

                    ratings.add(rating);
                }
            } catch (IOException | IllegalArgumentException e) {
                e.printStackTrace();
            }
            return ratings;
        }
        return null;
    }

    /**
     * Add the ratings in the events*/
    public Map<String,Event> assignRatingsToEvents(Map<String,Event> events, ArrayList<EventRating> ratings) {
        if (events != null && ratings != null) {
            HashMap<String, Event> eventsTemp = (HashMap) events;

            for (EventRating e : ratings) {
                Event event = eventsTemp.get(e.getEventName());
                event.addRating(e);
            }

            return eventsTemp;
        }
        return null;
    }
}
