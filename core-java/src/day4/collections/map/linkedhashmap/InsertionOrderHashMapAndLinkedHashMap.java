package day4.collections.map.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class InsertionOrderHashMapAndLinkedHashMap {

    public static void main(String[] args) {


        Map<Integer, String> integerStringMap = new HashMap<>();
//        integerStringMap.put(null, "LLL");
        integerStringMap.put(1, "ADD"); // hashcode 1 % 16 = 1 => Bucket 1
        integerStringMap.put(2, "EE"); //
        integerStringMap.put(3, "RR");
        integerStringMap.put(16, "HH"); // hashcode 16 % 16  = 0 => bucket 0
        integerStringMap.put(17, "QQ"); // hashcode 17 % 16 = 1 =
        integerStringMap.put(26, "AA");
        integerStringMap.put(4, "YY");
        integerStringMap.put(5, "TT");
        integerStringMap.put(6, "UU");
        integerStringMap.put(7, "VV");
        integerStringMap.put(32, "ZZ"); //hashcode 32 % 16 = 0
        integerStringMap.put(null, "LLL");

        System.out.println("HashMap Traversal Order");

        for (Map.Entry<Integer, String> entries : integerStringMap.entrySet()) {
            System.out.println("Key:: " + entries.getKey() + "  Value:: "+ entries.getValue());
        }

        System.out.println("========================================================================");
        Map<Integer, String> integerStringLinkedHashMap = new LinkedHashMap<>();
//        integerStringMap.put(null, "LLL");
        integerStringLinkedHashMap.put(1, "ADD"); // hashcode 1 % 16 = 1 => Bucket 1
        integerStringLinkedHashMap.put(2, "EE"); //
        integerStringLinkedHashMap.put(3, "RR");
        integerStringLinkedHashMap.put(16, "HH"); // hashcode 16 % 16  = 0 => bucket 0
        integerStringLinkedHashMap.put(17, "QQ"); // hashcode 17 % 16 = 1 =
        integerStringLinkedHashMap.put(26, "AA");
        integerStringLinkedHashMap.put(4, "YY");
        integerStringLinkedHashMap.put(5, "TT");
        integerStringLinkedHashMap.put(6, "UU");
        integerStringLinkedHashMap.put(7, "VV");
        integerStringLinkedHashMap.put(32, "ZZ"); //hashcode 32 % 16 = 0
        integerStringLinkedHashMap.put(null, "LLL");

        System.out.println("LinkedHashMap Traversal Order");

        for (Map.Entry<Integer, String> entries : integerStringLinkedHashMap.entrySet()) {
            System.out.println("Key:: " + entries.getKey() + "  Value:: "+ entries.getValue());
        }



    }
}
