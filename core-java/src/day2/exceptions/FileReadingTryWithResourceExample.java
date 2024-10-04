package day2.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingTryWithResourceExample {
    private static final String FILE_PATH = "C:\\BharathTraining\\RTA34\\CoreJava\\session_actual_programs\\core-java\\resources\\intput.txt";

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception Caught: Error while opening the connection with file: "+ FILE_PATH);
        } catch (IOException e) {
            System.out.println("An Error occured while reading the file: "+ e.getMessage());
        }

    }
}
