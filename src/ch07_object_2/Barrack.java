package ch07_object_2;

public class Barrack extends Building implements Liftable {

    private Liftable liftable;

    public Barrack(Liftable liftable) {
        this.liftable = new LiftableImpl();
    }

    @Override
    public void move(int x, int y) {
        liftable.move(x,y);
    }

    @Override
    public void liftOff() {
        newMethod();
        Liftable.staticMethod();
    }
}
