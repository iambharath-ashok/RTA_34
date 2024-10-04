package day4.collections.map.treemap;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapWithStringKeyExample {

    public static void main(String[] args) {

        /*TreeSet<String> fruitsTreeSet = new TreeSet<>();
        fruitsTreeSet.add("Orange");
        fruitsTreeSet.add("Grapes");
        fruitsTreeSet.add("Cherry");
        fruitsTreeSet.add("Banana");
        fruitsTreeSet.add("Mango");
        fruitsTreeSet.add("Apple");*/


        TreeMap<String, Integer> fruitTreeMap = new TreeMap<>(Comparator.reverseOrder());

        fruitTreeMap.put("Orange", 12);
        fruitTreeMap.put("Grapes", 90);
        fruitTreeMap.put("Cherry", 2);
        fruitTreeMap.put("Cherry", 9);
        fruitTreeMap.put("Banana", 5);
        fruitTreeMap.put("Banana", 15);
        fruitTreeMap.put("Mango", 0);
        fruitTreeMap.put("Apple", 19);
        fruitTreeMap.put("Apple", 90);


        System.out.println(fruitTreeMap);



    }
}
