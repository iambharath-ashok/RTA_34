package day4.collections.traversals.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorExample {

    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");

        // Create an Iterator for the ArrayList object
       Iterator<String> fruitsListIterator =  fruitsList.iterator();

       // Traverse the list using iterator
        System.out.println("Traversing list using Iterator");
        while (fruitsListIterator.hasNext()) {
            String fruit = fruitsListIterator.next();
            System.out.println("Fruit:: "+ fruit);
        }

    }
}
