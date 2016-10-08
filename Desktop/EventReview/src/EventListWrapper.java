import java.util.ArrayList;
import java.util.Map;

/**
 * Created by kylereckert on 10/8/16.
 */
public class EventListWrapper {

    public EventListWrapper() {

        //creates both csv files
        EventToCSV.createCSV();
        RatingsListCSV.createCSV();


    }

    public void addEvent(String name, String date, String location, int costOfTicket,
                         String organizer) {

        Event event = new Event(name);
        event.setDate(date);
        event.setLocation(location);
        event.setCostOfTicket(costOfTicket);
        event.setOrganizer(organizer);

        EventToCSV.addEvent(event);
    }

    public void addRating(String eventName, String author, int rating, String comment) {

        EventRating eventRating = new EventRating(eventName, author, rating, comment);
        RatingsListCSV.addEventRating(eventRating);
    }
}
