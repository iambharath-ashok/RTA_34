package day2.exceptions;

import java.util.Scanner;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class NullPointerObjectExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = null;// Initially, the person object is null.
        try {
            System.out.print("Would you like to Create a Person Object? (yes/no): ");

            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                System.out.print("Enter the Person's Name: ");
                String name = scanner.nextLine();
                person = new Person(name);
            }
            //Attempt to access the getName() method of the person Object
            System.out.println("Person's Name is : " + person.getName());
        } catch (NullPointerException e) {
            System.out.println("Exception Caught: Cannot call method on a Null Object.");
        } finally {
            System.out.println("Null pointer Check complete");
            scanner.close();
        }

    }
}
