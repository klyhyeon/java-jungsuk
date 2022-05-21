package ch13_thread;

public class ThreadStartEx {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
//        myThread.run();
        myThread.start();
    }
}


class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("run MyThread");
            throw new RuntimeException("MyThread exception");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
