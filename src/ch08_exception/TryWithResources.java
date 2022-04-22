package ch08_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    static String firstLineOfFileTryCatch(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    public static void main(String[] args) {
        try (Closeableresource cr = new Closeableresource()) {
            cr.exceptionWork(false);
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
        System.out.println();
        try (Closeableresource cr = new Closeableresource()) {
            cr.exceptionWork(true);
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
    }

    static class Closeableresource implements AutoCloseable {

        public void exceptionWork(boolean exception) throws WorkException {
            System.out.println("exceptionWork(" + exception + ") 가 호출됨");

            if (exception) {
                throw new WorkException("WorkException 발생!!");
            }
        }

        @Override
        public void close() throws CloseException {
            System.out.println("close()가 호출됨");
            throw new CloseException("CloseException 발생!!");
        }
    }

    static class WorkException extends Exception {
        WorkException(String msg) {
            super(msg);
        }
    }

    static class CloseException extends Exception {
        CloseException(String msg) {
            super(msg);
        }
    }
}
