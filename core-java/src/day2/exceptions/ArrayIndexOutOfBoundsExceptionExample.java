package day2.exceptions;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ArrayIndexOutOfBoundsExceptionExample {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

          //  int indexPosition = Integer.parseInt(args[0]);
            int indexPosition = scanner.nextInt();

            //                0,1,2,3,4
            int numbers[] = {10, 20, 30, 40, 50};

            int value = numbers[indexPosition];

            System.out.println("The value is: " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excpetion Caught: Array Index is out of Bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input. Only Integers Values are supported.");
        } catch(Exception e) {
            System.out.println("Generic Exception: "+ e.getMessage());
        } finally {
            System.out.println("Array index check is completed.");
        }
        System.out.println("This is an end of Main Method Execution.");
    }
}
