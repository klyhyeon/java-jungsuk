package ch12_generics.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GeniricsPrac {

    public static void main(String[] args) {
//        BoxGeneric<Integer> intBox = new BoxGeneric<>();
//        intBox.setItem(1);
//        System.out.println(intBox.getItem());

        BoxGeneric<Fruit> fruitBox = new BoxGeneric<>();
//        fruitBox.add(new Apple());
//        fruitBox.add(new Grape());

        Juice juice = Juicer.makeJuice(fruitBox);
        System.out.println(juice.getFruit());

        BoxGeneric<Fruit> applebox = new BoxGeneric<>();
        applebox.add(new Apple(100));
        applebox.add(new Apple(99));
        applebox.add(new Apple(101));
        applebox.add(new Apple(81));
        applebox.add(new Apple(21));
        applebox.add(new Apple(211));
        //comparator가 매개변수에 없을 경우, 객체에 내장된 compareTo를 사용
//        applebox.getList().sort(new AppleComp());
        applebox.getList().sort(Comparator.comparing(Fruit::getWeight));
//        Collections.sort(applebox.getList());
        System.out.println(applebox.getList());

        BoxGeneric.findBox(List.of(new BoxGeneric()));
    }

}

class Box {
    Object item;

    void setItem(Object item) {
        this.item = item;
    }

    Object getItem() {
        return item;
    }
}

class BoxGeneric<T extends Fruit> {
    T item;
    //    T[] allItems = new T[1];
    List<T> allItems = new ArrayList<>();

    static<T> void findBox(List<T> genericBoxes) {

    }

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    List<T> getList() {
        return this.allItems;
    }

    void add(T t) {
        allItems.add(t);
    }
}

class Fruit implements Comparable<Fruit> {
//class Fruit {

    private int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Fruit o) {
        return this.weight - o.weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
}

class Apple extends Fruit {

    private int weight;

    public Apple(int weight) {
        super(weight);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

}

class Grape extends Fruit {

    public Grape(int weight) {
        super(weight);
    }
}

class AppleComp implements Comparator<Apple> {

    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.getWeight() - o2.getWeight();
    }
}

class Juicer {
    static<T extends Fruit> Juice makeJuice(BoxGeneric<? super T> box) {
        String temp = "";
        for (Fruit f : box.getList()) {
            temp += f + " ";
        }
        return new Juice(temp);
    }
}

class Juice {

    private String fruit;

    public Juice(String fruit) {
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }
}