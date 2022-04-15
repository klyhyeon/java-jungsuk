package ch08_exception;

public class ChainedException {

    public static void main(String[] args) {
        RuntimeException re = new RuntimeException(new NullPointerException("RuntimeException"));
        System.out.println(re.getCause());
        re.printStackTrace();
        System.out.println("---------------------");
        Exception ex = new Exception();
        ex.initCause(new NullPointerException("Exception"));
        System.out.println(ex.getCause());
        re.printStackTrace();
    }
}
