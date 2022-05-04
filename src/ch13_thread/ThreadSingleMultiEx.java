package ch13_thread;

public class ThreadSingleMultiEx {

    static long startTime;

    public static void main(String[] args) {

//        SingleThread th1 = new SingleThread();
//        th1.start();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }
        System.out.print("소요시간1:" + (System.currentTimeMillis() - startTime));

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }

        System.out.print("소요시간2:" + (System.currentTimeMillis() - startTime));
    }
}

class SingleThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }

        System.out.print("소요시간2:" + (System.currentTimeMillis() - ThreadSingleMultiEx.startTime));
    }
}
