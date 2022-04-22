package ch10_date;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimePrac {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        localDateTime.getMinute();
        localDateTime.get(ChronoField.YEAR);
        System.out.println(localDateTime);
        System.out.println(localDateTime.withYear(2021));
        System.out.println(localDateTime);

        System.out.println(localDateTime.plus(Period.ofWeeks(2)));
        System.out.println(localDateTime.truncatedTo(ChronoUnit.DAYS));
    }
}
