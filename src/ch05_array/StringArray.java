package ch05_array;

public class StringArray {

    public static void main(String[] args) {
        hexToBinary();
//        int charToInt = Character.getNumericValue('Ⅼ');
//        int charToIntL = Character.getNumericValue('L');
//
//        System.out.println(charToInt);
//        System.out.println(charToIntL);
    }

    static void hexToBinary() {

        char[] hex = {'C', 'A', 'F', 'E'};
        System.out.println(hex);

        int[] intArr = {1,2,3,4};
        //0~15
        String[] binary =
                {
                "0000", "0001","0010","0011",
                "0100", "0101","0110","0111",
                "1000", "1001",

                "1010","1011", "1100", "1101","1110","1111"
                };

        String result = "";
        for (char c : hex) {
            if (c <= '9' && c >= '0') {
                result += binary[c];
            } else {
                System.out.println(binary[c]);
                result += binary[c - 'A' + 10];
            }
        }

        System.out.println(result);
        System.out.println(result.equals("1100101011111110")); //1100101011111110
    }
}
