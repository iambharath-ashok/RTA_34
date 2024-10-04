package day4.collections.set.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetInternalWorking {

    public static void main(String[] args) {


        LinkedHashSet<String> names = new LinkedHashSet<>();


        names.add("Bharath");

        // it will call the hash code method - to find the bucket address
        // if there is a collision  - then it will invoke equals method
        // if there is duplicate - then using equals it will replace the previous
        // Maintain the insertion order using Doubly linked list
            // -->

        LinkedHashSet<String> colorSet = new LinkedHashSet<>();

        colorSet.add("Red");
        colorSet.add("blue");
        colorSet.add("green");


        colorSet.add("Red");
        colorSet.add("Red");
        colorSet.add("Red");
        colorSet.add("Red");
        colorSet.add("Red");

        colorSet.add("white");
        colorSet.add("blue");

        System.out.println("Color Set:: "+ colorSet);


        LinkedHashSet<Integer> linkedHashSetInteger = new LinkedHashSet();
        linkedHashSetInteger.add(10);
        linkedHashSetInteger.add(20);
        linkedHashSetInteger.add(30);
        linkedHashSetInteger.add(40);
        linkedHashSetInteger.add(50);
        linkedHashSetInteger.add(60);
        linkedHashSetInteger.add(null);
        linkedHashSetInteger.add(70);
        linkedHashSetInteger.add(null);


        System.out.println("Linked has set:: "+ linkedHashSetInteger);


        HashSet<Integer> hashSetInteger = new HashSet();
        hashSetInteger.add(10);
        hashSetInteger.add(10);
        hashSetInteger.add(10);
        hashSetInteger.add(20);
        hashSetInteger.add(30);
        hashSetInteger.add(30);
        hashSetInteger.add(30);
        hashSetInteger.add(30);
        hashSetInteger.add(40);
        hashSetInteger.add(50);
        hashSetInteger.add(60);
        hashSetInteger.add(60);
        hashSetInteger.add(60);
        hashSetInteger.add(60);
        hashSetInteger.add(70);
        hashSetInteger.add(70);
        hashSetInteger.add(70);
        hashSetInteger.add(null);

        System.out.println("HashSet :: "+ hashSetInteger);

        System.out.println(50 % 16);
        System.out.println(20 % 16);
        System.out.println(70 % 16);
        System.out.println(40 % 16);
        System.out.println(30 % 16);

    }
}
