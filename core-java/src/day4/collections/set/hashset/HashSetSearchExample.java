package day4.collections.set.hashset;

import java.util.HashSet;

public class HashSetSearchExample {

    public static void main(String[] args) {


        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");


        fruits.add("Apple");

        //Display the HashSet elements
        System.out.println("Fruits HashSet:: "+ fruits);

        //Checking if an element exist in the HashSet
        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the Set");
        } else {
            System.out.println("Mango is not in the Set");
        }


        //Removing an element from the HashSet
        fruits.remove("Banana");
        System.out.println("After removing Banana: "+ fruits);


        //Iterating through the HashSet
        for (String fruit : fruits) {
            System.out.println("Fruit: "+ fruit);
        }

    }

}
