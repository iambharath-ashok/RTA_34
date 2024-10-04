package day4.collections.map.treemap;

import java.util.TreeMap;

public class EventSchedulerExample {

    public static void main(String[] args) {

        TreeMap<Long, String> eventScheduler = new TreeMap<>();

        eventScheduler.put(System.currentTimeMillis() + 300000, "Lunch");
        eventScheduler.put(System.currentTimeMillis() + 120000, "Presentation");
        eventScheduler.put(System.currentTimeMillis() + 60000, "Meeting");

        System.out.println(eventScheduler);



    }
}
