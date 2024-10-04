package day4.collections.set.hashset;

import java.util.HashSet;

public class HashSetBasicExample {

    public static void main(String[] args) {

        HashSet<String> colorSet = new HashSet<>();

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



    }
}
