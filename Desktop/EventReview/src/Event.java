import java.util.ArrayList;

/**
 * Created by kyle reckert on 10/8/16.
 *
 */
public class Event {

    private String name;
    private ArrayList<EventRating> ratings = new ArrayList<>();//all rating for event

    //criteria for rating
    private String date;
    private String location;
    private int costOfTicket;
    private String organizer;

    public Event(String name) {

        this.name = name;
        //default values
        date = "";
        location = "";
        costOfTicket = -1;
        organizer = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRatings(ArrayList<EventRating> ratings) {
        this.ratings = ratings;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCostOfTicket(int costOfTicket) {
        this.costOfTicket = costOfTicket;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<EventRating> getRatings() {
        return ratings;
    }

    public String getName() {
        return name;
    }

    public int getCostOfTicket() {
        return costOfTicket;
    }

    public String getOrganizer() {
        return organizer;
    }
    public boolean addRating(EventRating eventRating) {
        if(eventRating != null) {
            ratings.add(eventRating);
            return true;
        }
        return false;
    }
/*
    public void addRating(int score, String author) {

        EventRating rating = new EventRating(score, author);
        ratings.add(rating);
    }

    public void addRating(int score, String comment, String author) {

        EventRating rating = new EventRating(score, comment, author);
        ratings.add(rating);
    }
*/
    public int getScore() {
        if (ratings.size() == 0) //returns -1 if there are no ratings
            return -1;

        int score = 0;
        for (EventRating rating: ratings) {
            score += rating.getRatingScore();
        }
        return (score/ratings.size());
    }
}
