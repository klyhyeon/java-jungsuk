package ch10_date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatPrac {

    public static void main(String[] args) throws ParseException {
        System.out.println("LocalDateTime은 DateTimeFormatter 사용");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatterWeekDay = DateTimeFormatter.ofPattern("오늘은 E요일");
        System.out.println(dateTimeFormatter.format(localDateTime));
        System.out.println(dateTimeFormatterWeekDay.format(localDateTime));

        System.out.println("Date은 SimpleDateFormat 사용");
        Date date = new Date();
        System.out.println(date);

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date newDate = dateFormat.parse("2022-04-22");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(newDate);
        System.out.println(newDate);

        dateToLocalDateTime(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("오늘은 E요일");
        System.out.println(simpleDateFormat.format(date));
    }

    static void dateToLocalDateTime(Date date) {
        System.out.println(date);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.of("Asia/Seoul"));
        Date newDate = Date.from(localDateTime.toInstant(ZoneOffset.UTC));
        System.out.println(localDateTime);
    }
}
