package ch10_date;

import java.text.ChoiceFormat;

public class ChoiceFormatPrac {

    public static void main(String[] args) {
        String pattern = "60#D|70#C|80<B|90#A";
        ChoiceFormat choiceFormat = new ChoiceFormat(pattern);
        int[] scores = {91,90,80,88,70,52,60};


        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]+":"+choiceFormat.format(scores[i]));
        }
    }
}
