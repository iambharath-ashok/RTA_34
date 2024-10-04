package day4.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        queue.offer("Fourth");

        System.out.println("Queue:: "+ queue);

        System.out.println("First element in Queue:: " + queue.peek());

        System.out.println("Removing the First Element From Queue:: "+ queue.poll());

        System.out.println("Queue:: "+ queue);



    }
}
