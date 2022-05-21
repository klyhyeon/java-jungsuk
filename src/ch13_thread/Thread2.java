package ch13_thread;

public class Thread2 {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000L);
        Thread.yield();

        if (isSuspended()) {
            //...
        } else {
            Thread.yield();
        }
    }

    private static boolean isSuspended() {
        return true;
    }
}
