package day1.operators;

public class ConditionalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b; // Ternary operator
        System.out.println("The maximum value is: " + max);

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("The maximum value is: "+ max);
    }
}
