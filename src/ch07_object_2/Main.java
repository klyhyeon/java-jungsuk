package ch07_object_2;

import java.util.Vector;

import static ch07_object_2.Super.*;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        random();

        Card card = new Card("spade", 2);
//        card.NUMBER = 5;

//        Singleton singletonInstance = new Singleton();
        Singleton singletonInstance2 = Singleton.getInstance();

        Tv tv = new Tv();
        tv.channelUp();
        System.out.println(tv.channel);

        Tv t = new CaptionTv();
        CaptionTv c = new CaptionTv();
        System.out.println(t instanceof Tv);
        System.out.println(c instanceof Tv);
        System.out.println(t instanceof CaptionTv);
        System.out.println(c instanceof CaptionTv);

        long l = 1L;
        int i = (int) l;
        long l2 = i;

        Vector v = new Vector();
        v.add(1);
        System.out.println(v.size());

        AbstractChild ac = new AbstractChild();
    }
}
