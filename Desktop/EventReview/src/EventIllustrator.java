import java.util.ArrayList;
import java.util.List;

/**
 * Created by la57 on 08/10/16.
 */
public class EventIllustrator {
    private List<Event> events;

    /**
     * Construct Illustrator
     */
    public EventIllustrator() {
        events = new ArrayList<Event>();
    }

    public EventIllustrator(ArrayList<Event> events) {
        this.events = events;
    }

    public void illustrate() {
        for (Event e : events) {
            System.out.println("Demo Ivent"); // Print Name
                                 // Print other Attibute
        }
    }
}

