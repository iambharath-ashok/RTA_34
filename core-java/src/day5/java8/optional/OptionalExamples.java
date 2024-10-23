package day5.java8.optional;

import java.util.Optional;

public class OptionalExamples {


    public static void main(String[] args) {

        String name = "Bharath";

        Optional<String> nameOptional = Optional.ofNullable(name);

        System.out.println(nameOptional);


        if(nameOptional.isPresent()) {
            System.out.println("Value is present::" + nameOptional.get());
        } else {
            System.out.println("No value is present");
        }

        nameOptional.ifPresent(n -> System.out.println("value ::"+n));



    }
}
