package ch06_array;

import java.util.Random;

public class ArrayOperation {

    public static void main(String[] args) {
        double[] arr = new double[5];

        arr[0] = 5.0;

        mathRandom();
    }

    static void mathRandom() {
        System.out.println(System.currentTimeMillis());
        System.out.println((int) (Math.random() * 10));
        System.out.println(System.currentTimeMillis());
        System.out.println("====================");
        System.out.println(System.currentTimeMillis());
        Random random = new Random();
        System.out.println(random.nextInt(11));
        System.out.println(System.currentTimeMillis());
    }
}
