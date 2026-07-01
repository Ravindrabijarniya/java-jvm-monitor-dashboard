package com.ravindra.jvmmonitor.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtil {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private TimeUtil() {
    }

    public static String now() {

        return LocalDateTime.now().format(FORMATTER);

    }

    public static String formatUptime(long millis) {

        long seconds = millis / 1000;

        long minutes = seconds / 60;

        long hours = minutes / 60;

        seconds %= 60;

        minutes %= 60;

        return String.format(
                "%02dh %02dm %02ds",
                hours,
                minutes,
                seconds);

    }

}