package ch07_object_2;

public class SuperChild extends Super {

    private int a;

    public SuperChild(int a) {
        this.a = a;
    }

    @Override
    public void print() {
        System.out.println("superChild is me");
    }
}
