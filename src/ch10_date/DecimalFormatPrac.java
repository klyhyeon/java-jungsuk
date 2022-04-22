package ch10_date;

import java.text.DecimalFormat;

public class DecimalFormatPrac {

    public static void main(String[] args) {
        double number = 1234567.890123456789012345;
        DecimalFormat df = new DecimalFormat("#.#");
        String result = df.format(number);
        System.out.println(result);
    }
}