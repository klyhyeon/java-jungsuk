package ch10_date;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class CustomTemporalAdjusters implements TemporalAdjuster {


    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(2, ChronoUnit.DAYS);
    }

    public static OffsetDateTime with(ZoneOffset zoneOffset) {
        return LocalDateTime.now().atOffset(zoneOffset);
    }
}
