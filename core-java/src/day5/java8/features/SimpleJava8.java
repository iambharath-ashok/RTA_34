package day5.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleJava8 {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();


        //Before Java 8
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Cherry");
        fruits.add("Orange");

        for (String fruit: fruits) {
            System.out.println("Fruit Name:: "+ fruit);
        }

        System.out.println("After Java 8");
        //After Java 8
        List<String> fruitsJava8 = Arrays.asList("Apple", "Grapes", "Cherry", "Orange");
        fruitsJava8.forEach(fruit -> System.out.println("Fruit Name:: "+ fruit));



    }
}
