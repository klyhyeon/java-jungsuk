package ch07_object_2;

public class Singleton {

    private static final Singleton s = new Singleton();

    public static Singleton getInstance() {
        return s;
    }

    private Singleton() {

    }
}
