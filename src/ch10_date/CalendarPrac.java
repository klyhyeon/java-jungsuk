package ch10_date;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarPrac {

    static Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
    static Date date = new Date(calendar.getTimeInMillis());

    public static void main(String[] args) {
        System.out.println(calendar.getTime());
        System.out.println(date);

        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    }
}
