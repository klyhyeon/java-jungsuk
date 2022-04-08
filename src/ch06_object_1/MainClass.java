package ch06_object_1;

import ch05_array.DefaultModifier;

public class MainClass extends DefaultModifier {

    public static void main(String[] args) {
        StaticObject.getObject();

        String[] i = {""};
        int j = i.length;

        Car car = new Car();

    }
    void test() {
        DefaultModifier defaultModifier = new DefaultModifier();
        this.defaultModifierMethod();
    }

}
