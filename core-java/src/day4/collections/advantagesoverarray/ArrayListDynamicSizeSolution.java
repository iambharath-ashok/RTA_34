package day4.collections.advantagesoverarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDynamicSizeSolution {

    public static void main(String[] args) {

        List<String> studentNames = new ArrayList<>();

        studentNames.add("A");
        studentNames.add("B");
        studentNames.add("C");
        studentNames.add("D");
        studentNames.add("E");

        //Adding new student name is straight forward
        studentNames.add("F") ;

        //Printing all the elements of List
        System.out.println(studentNames);

        studentNames.add("Guru");
        for (String name : studentNames) {
            System.out.println(name);
        }



    }
}
