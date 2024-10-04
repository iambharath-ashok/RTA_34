package day4.collections.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FruitsCart {

    public static void main(String[] args) {

        Map<String, Integer> fruitsCart = new HashMap<>();

        fruitsCart.put("Apple", 10);
        fruitsCart.put("Banana", 40);
        fruitsCart.put("Grapes", 30);
        fruitsCart.put("Orange", 20);

        System.out.println("Fruits Cart:: "+ fruitsCart);
        // Validate whether apple is there in the cart
        // if its there then add 2 new apples to the cart
        if (fruitsCart.containsKey("Apple")) {
           int currentAppleCount =  fruitsCart.get("Apple");
           fruitsCart.put("Apple", currentAppleCount + 2);
        } else {
            fruitsCart.put("Apple", 5);
        }

        System.out.println("Updated Fruits Cart:: "+ fruitsCart);

        // How to traverse the Map
        // How to iterate the elements of Map
        // How to get only Keys of Map
        // How to get only values of Map

        // How to traverse the Map
        // How to iterate the elements of Map
        System.out.println("Current Fruit Stock of Cart");
        Set<Map.Entry<String, Integer>> fruitCartEntries = fruitsCart.entrySet();
        for (Map.Entry<String, Integer> fruitEntry : fruitCartEntries) {
            System.out.println("Fruit :: "+ fruitEntry.getKey() + " Count:: " + fruitEntry.getValue());
        }

        //How to get only Keys of Map
        Set<String> fruits = fruitsCart.keySet();
        System.out.println("Only Keys of the Map/ Fruits of the Cart:: "+ fruits);

        // How to get only values of Map
        Collection<Integer> fruitsCount = fruitsCart.values();
        System.out.println("Only Keys of the Map/Fruit Count of the Map:: "+ fruitsCount);

    }
}
