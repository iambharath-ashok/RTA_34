package day4.collections.queue;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.naturalOrder());

        queue.offer(15);// 15
        queue.offer(10);// [15, 10]
        queue.offer(30);//[30, 10, 15]
        queue.offer(40);//[40, 30, 15, 10]
        queue.offer(50);

        //[10,20,15,30,40]
        /*


                10
              /
             20
             20 > 10

             20
            /  \
           10  15

             20
            /  \
           10  15
          /
         30


             20
            /  \
           30  15
          /
         10

             30
            /  \
           20  15
          /
         10

             30
            /  \
           20  15
          /  \
         10   40

             30
            /  \
           40  15
          /  \
         10   20

             40
            /  \
           30  15
          /  \
         10   20

         Level Order: [40, 30, 15, 10, 20]



         40





*/
        System.out.println("Priority Queue:: "+ queue);


        int frontElement = queue.poll();
        System.out.println("Removed:: "+ frontElement);

        System.out.println("Queue after removed: : "+ queue);




    }
}
