package ch09_.prac;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise9_14 {

    private static final String REG_EX = "\\\\d{3}-\\\\d{4}-\\\\d{4}";

    public static void main(String[] args) {
        String[] phoneNumArr = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"
        };

        Scanner in = new Scanner(System.in);
        String phoneNumInput = in.nextLine();

        for (String phoneNum : phoneNumArr) {
            Pattern phoneNumPattern = Pattern.compile(".*" + phoneNumInput + ".*");
            Matcher phoneNumMatcher = phoneNumPattern.matcher(phoneNum);
            if (phoneNumMatcher.matches()) {
                System.out.println(phoneNum);
                break;
            }
            System.out.println("입력값이 맞지 않습니다.");
        }

    }
}
