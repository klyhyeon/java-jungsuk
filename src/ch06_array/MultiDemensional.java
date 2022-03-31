package ch06_array;

public class MultiDemensional {

    public static void main(String[] args) {
//        int[][] multiArr = new int[4][3];
        int[][] multiArr = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        System.out.println(multiArr[0][0]);
        System.out.println(multiArr[0][1]);
        System.out.println(multiArr[1][0]);
        System.out.println(multiArr[1][1]);
        int[][] scores = new int[5][3];
        System.out.println(scores[0].length);

    }

    private void changeableArray() {
        int[][] score = new int[5][];
        score[0] = new int[3];
        score[1] = new int[2];
    }
}
