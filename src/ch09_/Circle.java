package ch09_;

public class Circle implements Cloneable{

    Point p;

    public Circle deepCopy() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (Exception e) {

        }

        Circle c = (Circle) obj;
        c.p = new Point(this.p.x, this.p.y);
        return c;
    }
}
