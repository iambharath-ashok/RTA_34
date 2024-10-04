package day2.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {

    private static final String FILE_PATH = "C:\\BharathTraining\\RTA34\\CoreJava\\session_actual_programs\\core-java\\resources\\intput.txt";

    public static void main(String[] args) {


        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(FILE_PATH));
            String line;



            while((line = bufferedReader.readLine())!= null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception Caught: Error while opening the connection with file: "+ FILE_PATH);
        } catch (IOException e) {
            System.out.println("An Error occured while reading the file: "+ e.getMessage());
        } finally {
            if(bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("An Error occured while closing the file reader: "+ e.getMessage());
                }
            }
        }
    }
}
