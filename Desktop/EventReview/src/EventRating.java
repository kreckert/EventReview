/**
 * Created by td41 on 08/10/16.
 *
 */
public class EventRating {

    private String eventName;
    private String author;
    private int ratingScore; // 0 to 10
    private String comment;

    public EventRating(String eventName, String author, int rating, String comment) {
        this.eventName = eventName;
        this.author = author;
        this.ratingScore = rating;
        this.comment = comment;
    }

    public String getEventName() {
        return eventName;
    }

    public String getAuthor() {
        return author;
    }

    public int getRatingScore() {
        return ratingScore;
    }

    public String getComment() {
        return comment;
    }
}
