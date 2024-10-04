package day4.collections.traversals.foreach;

import java.util.HashSet;
import java.util.Set;

public class HashSetForEachExample {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(30);
        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(40);

        System.out.println("Traversing HashSet using for-each loop");
        for (Integer number: hashSet) {
            if(number == 40) {
                continue;
            }
            System.out.println("Number:: " + number);
        }
    }
}
