package day2.exceptions.throwkeyword;

public class ExampleThrow {

    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an Exception: "+ e.getMessage());
        }
    }


    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older to vote.");
        } else {
            System.out.println("Age is valid to vote.");
        }
    }

}
