package ch06_object_1;

public class StaticObject {

    public static StaticObject getObject() {
        StaticObject so = new StaticObject();
        so.nonStaticMethod();
        return new StaticObject();
    }

    void nonStaticMethod() {
        System.out.println();
    }
}
