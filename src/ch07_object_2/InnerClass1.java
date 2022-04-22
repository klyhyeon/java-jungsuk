package ch07_object_2;


public class InnerClass1 {

    void createInner1() {
        Inner1 inner1 = new Inner1();
        System.out.println(inner1.i);
    }

    public class Inner1 {
        private int i;

        public Inner1() {
            this.i = 5;
        }
    }
}
