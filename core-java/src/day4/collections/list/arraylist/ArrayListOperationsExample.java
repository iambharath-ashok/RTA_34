package day4.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperationsExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aegon");
        names.add("Baleon");
        names.add("Catelyn");
        names.add("Steve");
        names.add("Maria");


        //Original List
        System.out.println("Original List:: "+ names);

        //Searching an element in ArrayList
        System.out.println("List contains Aegon:: ? "+ names.contains("Aegon"));
        System.out.println("Index of Steve :: ? "+ names.indexOf("Steve"));
        System.out.println("Index of Sam (not in the list) :: ? "+ names.indexOf("Sam"));


        //Sorting a list
        System.out.println("Original List Before Sorting: "+names);
        Collections.sort(names);
        System.out.println("List after sorting: "+names);


        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Reverse Sorted List: "+names);

        //Fetching
        System.out.println("First element: "+names.get(0));
        System.out.println("Last element: "+names.get(names.size() - 1));

        //iterating
        // For each for
        for(String name : names) {
            System.out.println("Name: "+ name);
        }

        for(int i =0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }


}
