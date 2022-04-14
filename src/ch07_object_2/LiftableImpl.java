package ch07_object_2;

public class LiftableImpl implements Liftable {

    Liftable l = new LiftableImpl() {
        void method1() {

        }
    };

    @Override
    public void liftOff() {

    }

    @Override
    public void move(int x, int y) {

    }


}
