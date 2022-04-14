package ch07_object_2;

public interface Liftable {

    void liftOff();
    void move(int x, int y);


    default void newMethod() {
        System.out.println("interface default method");
    }
    static void staticMethod() {
        System.out.println("interface static method");
    }
}
