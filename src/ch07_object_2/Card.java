package ch07_object_2;

public class Card {

    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card(String kind, int num) {
        this.KIND = kind;
        this.NUMBER = num;
    }
}
