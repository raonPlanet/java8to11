package me.whiteship.java8to11;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipInputStream;

public class App {

    public static void main(String[] args) {

        // legacy 지원
        Date date = new Date();
        Instant instant = date.toInstant();
        Date newDate = Date.from(instant);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        ZonedDateTime dateTime = gregorianCalendar.toInstant().atZone(ZoneId.systemDefault());
        GregorianCalendar from = GregorianCalendar.from(dateTime);
        System.out.println(dateTime);
        System.out.println(from);
        System.out.println("=======================");
        ZoneId zoneId = TimeZone.getTimeZone("PST").toZoneId();
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
        System.out.println(zoneId);
        System.out.println(timeZone);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime plus = now.plus(10,ChronoUnit.DAYS);
        System.out.println(plus);

        // formatting
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(MMddyyyy));

        LocalDate parse = LocalDate.parse("07/15/1982", MMddyyyy);
        System.out.println(parse);

//        Instant now = Instant.now();
//        Instant plus = now.plus(10, ChronoUnit.SECONDS);
//        Duration between = Duration.between(now, plus);
//        System.out.println(between.getSeconds());
//
//       // 기간
//        LocalDate today = LocalDate.now();
//        LocalDate thisYearBirthday = LocalDate.of(2020, Month.JULY, 15);
//        Period period = Period.between(today, thisYearBirthday);
//        System.out.println(period.getDays());
//
//        Period until = today.until(thisYearBirthday);
//        System.out.println(until.get(ChronoUnit.DAYS));


    }
}
