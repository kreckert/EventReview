/**
 * Created by td41 on 08/10/16.
 *
 */
public class EventRating {

    private Event event;
    private String author;
    private int score; //0 to 10
    private String comment;

    public EventRating(Event event, String author, int score, String comment) {
        this.event = event;
        this.author = author;
        this.score = score;
        this.comment = comment;
    }

    public Event getEvent() {
        return event;
    }

    public String getAuthor() {
        return author;
    }

    public int getScore() {
        return score;
    }

    public String getComment() {
        return comment;
    }
}
