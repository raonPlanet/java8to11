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

        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println("Thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    System.out.println("interrupted!");
                    return;
                }

            }
        });

        thread.start();
        System.out.println("Hello: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();

    }

}
