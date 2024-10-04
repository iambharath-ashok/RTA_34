package day2.exceptions;

public class ArithmaticeExceptionClass {

    public static void main(String[] args) {
        try {
                int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed");
        } finally {
            System.out.println("This block is always gets executed");
        }
        System.out.println("This is an end of Main Method Execution.");
    }
}
