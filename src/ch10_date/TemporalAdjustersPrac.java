package ch10_date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersPrac {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nextMonday = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("다음주 월요일 날짜는:" + nextMonday);

        CustomTemporalAdjusters.with(ZoneOffset.UTC);
        CustomTemporalAdjusters customTemporalAdjusters = new CustomTemporalAdjusters();
        LocalDateTime twoDaysLater = (LocalDateTime) customTemporalAdjusters.adjustInto(now);
    }
}
