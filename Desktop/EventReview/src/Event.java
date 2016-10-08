import java.util.ArrayList;

/**
 * Created by kylereckert on 10/8/16.
 */
public class Event {

    private String name;
    private ArrayList<EventRating> ratings = new ArrayList<>();//all rating for event

    //criteria for rating
    private int friendsGoing;
    private int costOfTicket;
    private String organizer;

    public Event(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getFriendsGoing() {
        return friendsGoing;
    }

    public int getCostOfTicket() {
        return costOfTicket;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void addRating(int score, String author) {

        EventRating rating = new EventRating(score, author);
    }

    public void addRating(int score, String comment, String author) {

        EventRating rating = new EventRating(score, comment, author);
    }

    public int getScore() {
        if (ratings.size() == 0)
            return -1;

        int score = 0;
        for (int i = 0; i < ratings.size(); i++) {
            score += ratings.get(i).getScore();
        }
        return (score/ratings.size());
    }
}
