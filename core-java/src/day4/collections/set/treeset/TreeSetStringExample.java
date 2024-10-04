package day4.collections.set.treeset;

import java.util.TreeSet;

public class TreeSetStringExample {

    public static void main(String[] args) {

        TreeSet<String> fruitsTreeSet = new TreeSet<>();
        fruitsTreeSet.add("Orange");
        fruitsTreeSet.add("Grapes");
        fruitsTreeSet.add("Cherry");
        fruitsTreeSet.add("Banana");
        fruitsTreeSet.add("Mango");
        fruitsTreeSet.add("Apple");

        System.out.println("Fruits:: "+ fruitsTreeSet);

    }
}
