import java.util.Scanner;

/**
 * Created by kylereckert on 10/8/16.
 */
public class UserForm {

    Scanner scan = new Scanner(System.in);

    public void createEvent() {

        System.out.println("enter name of event");
        Event event = new Event(scan.next());

        System.out.println("enter price of ticket");
        event.setCostOfTicket(scan.nextInt());

        System.out.println("enter Date");
        event.setDate(scan.next());

        System.out.println("enter organizer");
        event.setOrganizer(scan.next());

        EventToCSV.addEvent(event);
    }

    public void rateEvent() {


    }
}
