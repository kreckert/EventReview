package Application;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ryosuke on 10/8/16.
 */
public class CSVTesting {
    public static void main(String[] args) {
        CSVParser parser = new CSVParser();

        Map eventMap = parser.parseEvents("events.csv");
        System.out.println(eventMap.size());
    }



}
