/**
 * Created by kylereckert on 10/8/16.
 */
public class Event {

    private int Rating;
    private String name;

    //criteria for rating
    private int friendsGoing;
    private int costOfTicket;
    private String organizer;

    public Event(String name) {
        this.name = name;
    }

    public void addRating(int userRating) {

        if (userRating >= 0 && userRating <= 1) {
            
        }
    }
}
