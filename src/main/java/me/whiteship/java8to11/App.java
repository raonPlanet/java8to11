package me.whiteship.java8to11;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipInputStream;

public class App {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(getRunnable("hello"));
        executorService.submit(getRunnable("Keesun"));
        executorService.submit(getRunnable("The"));
        executorService.submit(getRunnable("Java"));
        executorService.submit(getRunnable("Thread"));

        executorService.shutdown();


    }

    private static Runnable getRunnable(String hello) {
        return () -> System.out.println("Thread " + Thread.currentThread().getName());
    }


}
