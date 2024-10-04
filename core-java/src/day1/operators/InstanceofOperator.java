package day1.operators;

public class InstanceofOperator {
    public static void main(String[] args) {
        Object name = "Java";
        //Object name = Integer.valueOf("1");
        boolean result = name instanceof String; // Check if 'name' is an instance of String

        System.out.println("Is 'name' an instance of String? " + result);
    }
}
