package day4.collections.traversals.listiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {

        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Grape");
        fruitsList.add("Cherry");
        fruitsList.add("Mango");

        System.out.println("Fruits Basket:: "+ fruitsList);

//        fruitsList.iterator();
        ListIterator<String> listIterator = fruitsList.listIterator();
        System.out.println("Traversing List in Forward Direction");
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }

        System.out.println("Traversing List in Backward Direction");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }

    }
}
