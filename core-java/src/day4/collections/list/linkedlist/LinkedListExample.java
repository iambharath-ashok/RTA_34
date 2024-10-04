package day4.collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {


    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        // Creating a LL of Fruits


        LinkedList<String> fruits = new LinkedList<>();

        //Adding elements into Linked List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");


        //Adding element at a specific index
        fruits.add(2, "Orange");

        System.out.println("Initial LinkedList:: "+ fruits);


        // Removing an element from the LinkedList
        fruits.remove("Banana");
        System.out.println("After removing Banana:: "+ fruits);


        //Removing an element at a specific index
        fruits.remove(2);
        System.out.println("After removing element at index 2: "+ fruits);



        //Getting/Retrieving element from LL
        String firstFruit = fruits.get(0);
        System.out.println("Current First Element :: "+firstFruit);


        //Checking if the LL contains a specific element
        boolean containsCherry = fruits.contains("Cherry");
        System.out.println("Is Contains Cherry:: "+ containsCherry);

        //Is LL empty?
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is LL Empty :: "+isEmpty);


        //Size of LL
        int sizeOfLL = fruits.size();
        System.out.println("Size of LinkedList:: "+ sizeOfLL);




    }
}
