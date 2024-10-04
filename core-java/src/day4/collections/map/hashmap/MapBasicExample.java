package day4.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapBasicExample {

    public static void main(String[] args) {


        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Student #1Name");
        studentMap.put(2, "Student #2Name");
        studentMap.put(3, "Student #3Name");
        studentMap.put(4, "Student #4Name");

        //key part will hashcode() - bucket
        //hash collision
        //equals method
        // if equals method returs true then replace the value part with new one
        // else create a new node and attach to existing linked list on the particular bucket


        studentMap.get(3);
    }
}
