package day1.operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int counter = 10;

      //  counter++; //  counter = counter + 1;

        int result = counter++;

        System.out.println("Result:: "+ result);

        System.out.println("counter++: " + (counter++)); // Post-increment
        System.out.println("++counter: " + (++counter)); // Pre-increment
        System.out.println("counter--: " + (counter--)); // Post-decrement
        System.out.println("--counter: " + (--counter)); // Pre-decrement
    }
}
