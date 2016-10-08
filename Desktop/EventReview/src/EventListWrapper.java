import java.util.ArrayList;
import java.util.Map;

/**
 * Created by kylereckert on 10/8/16.
 */
public class EventListWrapper {

    /**
     * creates event and Ratings file
     */
    public EventListWrapper() {

        //creates both csv files
        EventToCSV.createCSV();
        RatingsListCSV.createCSV();

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
}