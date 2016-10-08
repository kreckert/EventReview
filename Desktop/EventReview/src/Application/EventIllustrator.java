package Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by la57 on 08/10/16.
 */
public class EventIllustrator {

    private List<Event> events;
    private List<EventRating> ratings;

    private CSVParser csvParser;

    /**
     * Construct Illustrator
     */
    public EventIllustrator() {
        events = new ArrayList<>();
        ratings = new ArrayList<>();
       // csvParser = new
    }

    public void illustrate() {
        for (Event e : events) {
            System.out.println("Demo Ivent"); // Print Name
                                 // Print other Attibute
        }
    }
}

