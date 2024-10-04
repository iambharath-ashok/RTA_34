package day4.collections.traversals.foreach;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachExample {

    public static void main(String[] args) {


        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");

        System.out.println("Fruits Basket has:: "+ fruitsList);
        System.out.println("Traversing List using for-each loop:");
        fruitsList.add("Dragon Fruit");
        for (String fruit : fruitsList) {
           // fruitsList.add("Grapes");
            System.out.println("Fruit Details:: "+ fruit);
           // fruitsList.remove("Apple");
        }
        fruitsList.add("Cherry");
        System.out.println("Fruits Basket has:: "+ fruitsList);
    }
}
