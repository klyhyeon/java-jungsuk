package ch07_object_2.test;

import ch07_object_2.AbstractChild;

public class TestAbstract {

    void test() {
        AbstractChild ac = new AbstractChild();
        ac.completedMethod();
        ac.setParent();
    }
}
