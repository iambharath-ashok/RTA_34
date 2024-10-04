package day4.collections.list.arraylist;

import java.util.ArrayList;

public class ArrayListMethodsExample {

    public static void main(String[] args) {

        ArrayList<String> stundentsNames = new ArrayList<>();

        //1. Add the elements/Student names into ArrayList
        stundentsNames.add("Aegon");
        stundentsNames.add("Baleon");
        stundentsNames.add("Catelyn");
        System.out.println("After adding students: "+stundentsNames);

        //2. Insert an element at specific index
        stundentsNames.add(2, "David");
        System.out.println("After adding element at index 2"+ stundentsNames);

        //3. Remove an element by specific index
        stundentsNames.remove(3); // Removes the element at index 3
        System.out.println("After removing element at index 3: "+ stundentsNames);


        //4. Remove an element by value
        stundentsNames.remove("Baleon");
        System.out.println("After removing Baleon: "+ stundentsNames);


        // 5. Get an element from a specific index
        String studentNameAtIndex1 = stundentsNames.get(1);
        System.out.println("Element at index 1: "+ studentNameAtIndex1);

        //6. Get the size of the Arraylist
        System.out.println("Size of the ArrayList: "+stundentsNames.size());


    }
}
