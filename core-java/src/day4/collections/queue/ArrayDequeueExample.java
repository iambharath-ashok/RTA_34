package day4.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(100);
        queue.offer(20);
        queue.offer(10);

        System.out.println("Queue:: "+ queue);
    }
}
