package day5.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStream {

    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("Alice", "Bob", "Charlie", "David", "Aegon", "Alexander", "Ashok");

        Stream<String> stream = namesList.stream();


        Stream<String> filteredStream = namesList.stream().filter((name) -> name.startsWith("A"));

        List<String> filteredNames = namesList.stream().filter((name) -> name.startsWith("A")).collect(Collectors.toList());

        System.out.println(filteredNames);

        List<String> namesLengthAbove4Char = filteredNames.stream().filter((name) -> name.length() > 5).collect(Collectors.toList());

        System.out.println(namesLengthAbove4Char);

        namesList.stream()
                .filter((name) -> name.startsWith("A"))
                .map((name) -> name + " The Great")
                .filter(name -> name.length() > 5)
                .forEach(name -> System.out.println(name));




    }
}
