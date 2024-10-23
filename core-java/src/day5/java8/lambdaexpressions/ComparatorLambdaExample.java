package day5.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Peter", "Jacob","Anna", "Charlie");

        // Before java 8
        Comparator<String> sortByAlphabeticalOrder = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };

        //After Java 8

        Comparator<String> sortByAplhabeticalOrderJava8 = (o1, o2) -> {
            return o1.compareTo(o2);
        };

        names.sort(sortByAplhabeticalOrderJava8);

        System.out.println(names);

    }
}
