package day5.java8.functionalinterfaces;

import java.util.function.Consumer;

@FunctionalInterface
public interface MyCustomFunctionalInterface {

    public void simpleMethod(String name);


    default void saySomething() {

    }

    static void utilMethod() {
        System.out.println("Utility Method");
    }

}


class TestCustomFunctionalInterface {

    public static void main(String[] args) {
        MyCustomFunctionalInterface customFunctionalInterface = (a) -> {
            System.out.println("Hello, "+ a);
        };

        customFunctionalInterface.simpleMethod("bharath");
    }
}