/**
 * Created by kylereckert on 10/8/16.
 */
public class Event {

    private int rating;
    private int numOfRatings;
    private String name;

    //criteria for rating
    private int friendsGoing;
    private int costOfTicket;
    private String organizer;

    public Event(String name) {

        this.name = name;
        rating = 0;
        numOfRatings = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFriendsGoing(int friendsGoing) {
        this.friendsGoing = friendsGoing;
    }

    public void setCostOfTicket(int costOfTicket) {
        this.costOfTicket = costOfTicket;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public void addRating(int userRating) {

        if (userRating >= 0 && userRating <= 1) {

            rating = ((rating * numOfRatings) + userRating)/(numOfRatings + 1);
            numOfRatings++;
        }
    }

    public void printDescription() {

        System.out.println(name + ":");
        System.out.println("Cost of Ticket: " + costOfTicket);
        System.out.println("Organizer:" + organizer);
    }
}
