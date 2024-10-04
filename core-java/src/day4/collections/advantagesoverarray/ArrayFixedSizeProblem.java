package day4.collections.advantagesoverarray;

import java.util.Arrays;

public class ArrayFixedSizeProblem {

    public static void main(String[] args) {

        String [] studentNames = new String[3];

        studentNames[0] = "A";
        studentNames[1] = "B";
        studentNames[2] = "C";

        System.out.println(Arrays.deepToString(studentNames));

        //Now, we want to add another student name into existing array
        //We cannot directly add a new element as array size is fixed
        //We would need to create a new larger array to accomodate more elements

        String [] newStudentNames = new String[4];
        for (int i = 0; i < studentNames.length; i++) {
            newStudentNames[i]  = studentNames[i];
        }

        newStudentNames[3] = "D"; //Addding new element to array

        for (int i = 0; i < newStudentNames.length; i++) {
            System.out.println(newStudentNames[i]);
        }

        // Disadvantages
        // Fixed size or static sizing
        // Manual Copying
        // Less Memory Utilization


    }
}
