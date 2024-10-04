package day4.collections.map.treemap;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapWithIntegerKeyExample {

    public static void main(String[] args) {

/*
        TreeSet<Integer> integerTreeSet = new TreeSet<>(Comparator.reverseOrder());// Tree Set Collection

        integerTreeSet.add(7);
        integerTreeSet.add(3);
        integerTreeSet.add(4);
        integerTreeSet.add(5);
        integerTreeSet.add(4);
        integerTreeSet.add(1);*/


//        TreeMap<Integer, String> integerTreeMap = new TreeMap<>(Comparator.reverseOrder());
        TreeMap<Integer, String> integerTreeMap = new TreeMap<>();
        integerTreeMap.put(3, "ccc");
        integerTreeMap.put(12, "ppp");
        integerTreeMap.put(1, "ooo");
        integerTreeMap.put(10, "qqq");
        integerTreeMap.put(-1, "yyy");
        integerTreeMap.put(5, "cee");
        integerTreeMap.put(3, "fff");


        //Traverse the Tree Map
        System.out.println(integerTreeMap);


    }
}
