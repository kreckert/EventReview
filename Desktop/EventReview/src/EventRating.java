/**
 * Created by td41 on 08/10/16.
 *
 */
public class EventRating {

    private Event event;
    private String author;
    private int rating; // 0 to 10
    private String comment;

    public EventRating(Event event, String author, int rating, String comment) {
        this.event = event;
        this.author = author;
        this.rating = rating;
        this.comment = comment;
    }

    public Event getEvent() {
        return event;
    }

    public String getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}
