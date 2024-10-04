package day4.collections.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetIterationExample {

    public static void main(String[] args) {


        LinkedHashSet<Double> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(1.2);
        linkedHashSet.add(3.6);
        linkedHashSet.add(4.5);
        linkedHashSet.add(9.9);

        System.out.println("LinkedHashSet Iteration Using For-each loop");
        for (Double number : linkedHashSet) {
            System.out.println(number);
        }

        //Iterate using Iterator
        System.out.println("Iterating using Iterator");
        Iterator<Double> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
