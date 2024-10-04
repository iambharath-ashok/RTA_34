package day4.collections.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetIntegerExample {

    public static void main(String[] args) {

        // In order to use any class with TreeSet, that class should implement either comparator or comparable interface
        TreeSet<Integer> integerTreeSet = new TreeSet<>(Comparator.reverseOrder());// Tree Set Collection

        integerTreeSet.add(7);
        integerTreeSet.add(3);
        integerTreeSet.add(4);
        integerTreeSet.add(5);
        integerTreeSet.add(4);
        integerTreeSet.add(1);

        System.out.println("TreeSet Content:: "+integerTreeSet);

     //   integerTreeSet.add(null);

        System.out.println(integerTreeSet);


    }
}
