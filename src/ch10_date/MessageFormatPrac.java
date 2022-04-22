package ch10_date;

import java.text.MessageFormat;

public class MessageFormatPrac {

    public static void main(String[] args) {

        String tableName = "CUST_INFO";
        String msg = "INSERT INTO " + tableName
                + " VALUES(''{0}'',''{1}'',{2},''{3}'');";
        Object[][] arguments = {
                {"이자바", "02-123-1234", 27, "07-09"},
                {"김프로", "010-1234-1234", 30, "07-10"},
        };

        for (int i = 0; i < arguments.length; i++) {
            String result = MessageFormat.format(msg, arguments[i]);
            System.out.println(result);
        }
    }
}
