package day2.exceptions.throwskeyword;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleThrows {

    public static void main(String[] args)  {
        try {
            readFile("path to file");
        } catch (IOException e ) {
            System.out.println("Caught an IOException: "+ e.getMessage());
        }

        checkAge(10);
    }


    public static void readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        System.out.println(line);
        reader.close();

    }


    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older to vote.");
        } else {
            System.out.println("Age is valid to vote.");
        }
    }
}
