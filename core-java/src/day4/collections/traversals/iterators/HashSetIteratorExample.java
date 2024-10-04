package day4.collections.traversals.iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteratorExample {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(30);
        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(40);
        hashSet.add(50);

        System.out.println("Traversing HashSet using Iterator");
        System.out.println("Set Numbers :: "+ hashSet);
        Iterator<Integer> hashSetIterator = hashSet.iterator();
        while (hashSetIterator.hasNext()) {
            int number = hashSetIterator.next();
          //  hashSet.add(70);
            if(number == 50) {
                hashSetIterator.remove();
                continue;
            }
            System.out.println("Number:: "+ number);
          //  hashSet.add(80);
          //  hashSet.remove(10);
        }
        System.out.println("Set contents after Iteration:: "+ hashSet);
    }
}
