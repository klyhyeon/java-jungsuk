package ch10_date;

public class StringFormatPrac {


    public static void main(String[] args) {

        String tableName = "CUST_INFO";
        Object[][] arguments = {
                {"이자바", "02-123-1234", 27, "07-09"},
                {"김프로", "010-1234-1234", 30, "07-10"},
        };

        for (int i = 0; i < arguments.length; i++) {
            String result = String.format("INSERT INTO" + tableName
                                + " VALUES('%s', '%s', %d, '%s');",
                        arguments[i][0],
                        arguments[i][1],
                        arguments[i][2],
                        arguments[i][3]);
            System.out.println(result);
        }
    }
}
