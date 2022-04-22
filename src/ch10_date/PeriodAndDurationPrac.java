package ch10_date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationPrac {


    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2014, 1, 1);
        LocalDate date2 = LocalDate.of(2015, 12, 31);
        Period period = Period.between(date1, date2);
        long year = period.getYears();
        System.out.println(year);

        LocalTime time1 = LocalTime.of(00, 00, 00);
        LocalTime time2 = LocalTime.of(12, 34, 56);
        Duration duration = Duration.between(time1, time2);
        long seconds = duration.getSeconds();
        System.out.println(seconds/3600);

        LocalTime tmpTime = LocalTime.of(0,0).plusSeconds(seconds);
        int hour = tmpTime.getHour();
        System.out.println(hour);

        long hoursUntil = LocalTime.now().until(LocalTime.now().plusHours(11), ChronoUnit.HOURS);
        long chronoHours = ChronoUnit.HOURS.between(LocalTime.now(), LocalTime.now().plusHours(11));
        System.out.println(hoursUntil);
        System.out.println(chronoHours);
    }


}
