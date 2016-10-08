/**
 * Created by td41 on 08/10/16.
 *
 */
public class EventRating {

    private int score;//0 to 10
    private String comment;
    private String Author;

    public EventRating(int score, String author) {
        this.score = score;
        Author = author;
    }

    public EventRating(int score, String comment, String author) {
        this.score = score;
        this.comment = comment;
        Author = author;
    }

    public String getAuthor() {
        return Author;
    }

    public int getScore() {
        return score;
    }

    public String getComment() {
        return comment;
    }
}
