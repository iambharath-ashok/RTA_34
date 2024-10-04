package day2.exceptions.nestedexception;

import java.io.IOException;

public class NestedExceptionExample {

    public static void main(String[] args) {
        try {
            methodA("some wrong file");
        } catch (IOException e) {
            System.out.println("Caught an exception:"+ e.getMessage());
            throw new CustomException("Failed to execute method due to I/O error", e);
        }
    }


    public static void methodA(String filePath) throws IOException {
        methodB(filePath);
    }

    public static void methodB(String filePath) throws IOException {
        methodThatThrowsIOException(filePath);
    }

    public static void methodThatThrowsIOException(String filePath) throws IOException {
        throw new IOException("Unable to read the File: "+filePath);
    }
}


class CustomException extends RuntimeException {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

}
