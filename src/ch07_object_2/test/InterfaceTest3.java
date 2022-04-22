package ch07_object_2.test;


public class InterfaceTest3 {

    void interfaceTest3() {
        A a = new A();
        a.methodA();
    }
}

class A {
    void methodA() {
        I i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i);
    }
}

interface I {
    public void methodB();
}

class B implements I {

    @Override
    public void methodB() {
        System.out.println("methodB in B class");
    }

    @Override
    public String toString() {
        return "Clas B";
    }
}

class InstanceManager {
    public static I getInstance() {
        return new B();
    }
}