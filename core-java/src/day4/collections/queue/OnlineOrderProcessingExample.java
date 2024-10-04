package day4.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class OnlineOrderProcessingExample {

    public static void main(String[] args) {
        Queue<String> orderQueue = new ArrayDeque<>();

        orderQueue.offer("Order #001");
        orderQueue.offer("Order #002");
        orderQueue.offer("Order #003");
        orderQueue.offer("Order #004");

        // Process the orders in Queue
        while(!orderQueue.isEmpty()) {
            String order = orderQueue.poll();
            System.out.println("Processing:: "+ order);
        }

        for (String order : orderQueue) {
            System.out.println("Processing:: "+ order);
        }

    }
}
