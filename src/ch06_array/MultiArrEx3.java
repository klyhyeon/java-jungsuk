package ch06_array;

public class MultiArrEx3 {

    public static void main(String[] args) {
        int[][] a = {
                {1,2,3},
                {4,5,6}
        };
        int[][] b = {
                {1,2},
                {3,4},
                {5,6}
        };

        int [][] multiplyResult = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    multiplyResult[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < multiplyResult.length; i++) {
            for (int j = 0; j < multiplyResult[0].length; j++) {
                System.out.print(multiplyResult[i][j] + " ");
            }
            System.out.println();
        }
    }
}
