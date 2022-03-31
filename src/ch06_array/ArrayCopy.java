package ch06_array;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] tmp = new int[10];
        arr = tmp;
        System.out.println("arr length: " + arr.length);
        System.out.println("tmp length: " + tmp.length);
    }

    private String[] arr;

    void systemCopy() {
    }

    void arrayCopy() {
        Arrays.copyOf(arr, 5);
    }
}
