package me.whiteship.java8to11;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

       // human date & time
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime birthDay = LocalDateTime.of(1982, Month.JULY, 15, 0, 0, 0);
        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(birthDay);
        System.out.println(nowInKorea);

        Instant nowInstant = Instant.now();
        ZonedDateTime zonedDateTime = nowInstant.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime);
    }
}
