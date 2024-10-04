package day4.collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListSpecificMethodsExample {

    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();


        //Adding elements into Linked List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("grapes");
        fruits.add("apricoats");
        fruits.add("Mango");
        System.out.println("Linked List:: "+ fruits);

        //Add First
        fruits.addFirst("Cherry");
        System.out.println("After adding Cherry at the first:: "+ fruits);

        //Add Last
        fruits.addLast("Orange");
        System.out.println("After adding at last of LL:: "+ fruits);


        //Get First
        String firstElement = fruits.getFirst();
        System.out.println("First Element:: "+ firstElement);

        //Get Last
        String lastElement = fruits.getLast();
        System.out.println("Last Element:: "+ lastElement);


        //removeFirst
        String removedLastElement = fruits.removeLast();
        System.out.println("Last Element:: "+ removedLastElement);
        System.out.println("Fruits after removing:: "+ fruits);

        //removeLast
        String removedFirstElement = fruits.removeFirst();
        System.out.println("Removed First Element:: "+ removedFirstElement);
        System.out.println("Fruits after removing:: "+ fruits);



        //peek
        String peekedElement = fruits.peek();// Peek just retrieves the frist element of LL but doesn't remove the element from list.
        System.out.println("Peeked Element:: "+ peekedElement);
        System.out.println("Fruits :: "+ fruits);

        //poll
        String polledElement = fruits.poll();// Poll just retrieves the frist element of LL and also remove the element from list.
        System.out.println("Polled Element:: "+ peekedElement);
        System.out.println("Fruits :: "+ fruits);


        //offer
        boolean offeredElement = fruits.offer("Dragon Fruit");
        System.out.println("Fruits after offering an element :: "+ fruits);

        //offerFirst
        //offerLast

        //peekFirst
        //peeklast

        //pollFirst
        //pollLast


    }
}
