package ch05_array;

import java.util.Scanner;

public class MultiArrEx1 {

    final static int SIZE = 10;

    public static void main(String[] args) {
        int x = 0, y = 0;
        char zeroChar = '0';

        char[][] board = new char[10][10];
        byte[][] shipBoard = {
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 1, 0}
        };
        //1행에 행번호를, 1열에 열번호를 저장
        for (int i = 0; i < board.length; i++) {
            board[0][i] = (char) (i + zeroChar);
            board[i][0] = (char) (i + zeroChar);
        }
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("좌표를 입력하세요.(종료는 00)>");
            String input = scanner.nextLine();

            if (input.length() == 2) {
                x = input.charAt(0) - zeroChar;
                y = input.charAt(1) - zeroChar;

                if (x == 0 && y == 0) {
                    break;
                }

            }

            if (!isValid(x, y) || input.length() != 2) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }

            board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';

            for (int i = 0; i < SIZE; i++) {
                System.out.println(board[i]);
            }
        }

    }

    private static boolean isValid(int x, int y) {
        if (x <= 0 || y <= 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return true;
    }
}
