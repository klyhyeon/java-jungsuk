package ch06_array;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        bubbleSort();
    }

    static void bubbleSort() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        int loop = arr.length;
        while (loop > 0) {
            boolean notChanged = true;
            for (int j = 0; j < loop - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    notChanged = false;
                }
            }
            loop--;
            if (notChanged) {
                break;
            }
        }
        Arrays.stream(arr)
                .forEach(System.out::println);
    }


}
