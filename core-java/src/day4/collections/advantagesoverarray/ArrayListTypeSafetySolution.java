package day4.collections.advantagesoverarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTypeSafetySolution {

    public static void main(String[] args) {

        //Create a ArrayList
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello"); //Adding a String
       // stringList.add(124); // Compile-time error: incompatible type
      //  stringList.add(99.00);
      //  stringList.add(new Person());
      //  stringList.add(new Dog());

        for(String str: stringList) {
            System.out.println(str); // No casting is requried, safe to assume all elements are of type String.
        }


    }
}
