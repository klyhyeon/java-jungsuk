package ch08_exception;

import java.io.*;

public class intensionalError {

    public static void main(String[] args) {
        int errorCount = 0;
        try {
            String s = "input";
            methodExceptionTest(s);
        } catch(Exception e) {
            errorCount++;
            System.out.println("main Error Handling");
            System.out.println("errorCount: " + errorCount);
        }
    }

    static void methodExceptionTest(String s) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("File");
    }
}
