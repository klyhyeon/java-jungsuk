import java.util.ArrayList;
import java.util.List;

public class TestAnything {

    public static void main(String[] args) {
        int a = 1;
        Integer b = 2;
        List<Integer> c = new ArrayList<>();
        c.add(1);
        changeInt(a);
        changeInt(b);
        addList(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static void changeInt(int i) {
        i = 10000;
    }

    static void addList(List<Integer> l) {
        l = new ArrayList<>();
    }
}
