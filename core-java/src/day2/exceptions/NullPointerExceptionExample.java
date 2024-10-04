package day2.exceptions;

import java.util.Scanner;

public class NullPointerExceptionExample {

   static final double PI = 3.12;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the Name");

            String name = scanner.nextLine();

            if (name.equals("")) {
                name = null;
            }

            int length = name.length();
            System.out.println("The lenght of your name is :" + length);
        } catch (NullPointerException e) {
            System.out.println("Exception Caught: Cannot call method on a null Object");
        } catch (Exception e) {

        }
        finally {
            System.out.println("Null Check complete");
            scanner.close();
        }
    }
}
