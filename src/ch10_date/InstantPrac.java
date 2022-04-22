package ch10_date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class InstantPrac {

    public static void main(String[] args) {

        Instant instant = Instant.now();
//        OffsetDateTime offsetDateTime = OffsetDateTime.now(seoulZoneId);
//        System.out.println(instant.toEpochMilli());

        Date date = new Date();
//        System.out.println(date.getTime());

        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime.toEpochSecond(ZoneOffset.of("+09:00")));
//        System.out.println(localDateTime.toInstant(ZoneOffset.of("+09:00")).toEpochMilli());

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        ZoneOffset zoneOffset = ZoneOffset.of("+09:00");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss.n");
        LocalDateTime zonedLocalDateTime = LocalDateTime.now(seoulZoneId);
        OffsetDateTime offsetLocalDateTime = localDateTime.atOffset(zoneOffset);
        System.out.println("zonedLocalDateTime: "+formatter.format(zonedLocalDateTime));
        System.out.println("offsetLocalDateTime: "+formatter.format(offsetLocalDateTime));

    }
}
