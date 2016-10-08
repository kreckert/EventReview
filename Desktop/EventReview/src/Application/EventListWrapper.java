package Application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kylereckert on 10/8/16.
 */
public class EventListWrapper {

    private CSVParser csvParser;

    private Map<String,Event> events; // String is Event Name, Event name is unique
    private ArrayList<EventRating> ratings; // String is Event Name, Event name is unique

    private static final String EVENTS_FILE_NAME = "events.csv";
    private static final String EVENTRATINGS_FILE_NAME = "eventRatings.csv";

    /**
     * creates event and Ratings file
     */
    public EventListWrapper() {

        //creates both csv files
        EventToCSV.createCSV();
        RatingsListCSV.createCSV();
        csvParser = new CSVParser();
        events = new HashMap<>();
        ratings = new ArrayList<>();
    }

    public void updateEvents() {

        events = csvParser.parseEvents(EVENTS_FILE_NAME);
    }

    public void updateRatings() {

        ratings = csvParser.parseEventRatings(EVENTRATINGS_FILE_NAME);
        events = csvParser.assignRatingsToEvents(events, ratings);
    }

    /**
     * creates event and add it to CSV
     *
     * @param name
     * @param date
     * @param location
     * @param costOfTicket
     * @param organizer
     */
    public void addEvent(String name, String date, String location, int costOfTicket,
                         String organizer) {

        //creates event object
        Event event = new Event(name);
        event.setDate(date);
        event.setLocation(location);
        event.setCostOfTicket(costOfTicket);
        event.setOrganizer(organizer);

        //adds to csv
        EventToCSV.addEvent(event);
    }


    /**
     * creates rating and adds it to CSV
     *
     * @param eventName
     * @param author
     * @param rating
     * @param comment
     */
    public void addRating(String eventName, String author, int rating, String comment) {

        EventRating eventRating = new EventRating(eventName, author, rating, comment);
        RatingsListCSV.addEventRating(eventRating);
    }

    /**
     * returns event depending on key in hashmap
     * @param eventName
     * @return
     */
    public Event findEvent(String eventName) {

        updateEvents();
        return events.get(eventName);
    }

    public ArrayList<EventRating> getRatings(String eventName) {

        updateEvents();
        updateRatings();
        ArrayList<EventRating> returnList = new ArrayList<>();

        for (EventRating eventRating : ratings) {
            if (eventRating.getEventName().equals(eventName)){
                returnList.add(eventRating);
            }
        }

        return returnList;
    }
}
