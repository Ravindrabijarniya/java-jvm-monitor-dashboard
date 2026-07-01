package com.ravindra.jvmmonitor.util;

public class ProgressBarUtil {

    private ProgressBarUtil() {
    }

    public static String build(long used,
            long max) {

        if (max <= 0)
            return "[N/A]";

        int width = 30;

        double ratio = (double) used / max;

        int filled = (int) (ratio * width);

        StringBuilder bar = new StringBuilder("[");

        for (int i = 0; i < width; i++) {

            if (i < filled)
                bar.append("=");

            else
                bar.append(" ");

        }

        bar.append("] ");

        bar.append(String.format("%.1f%%",
                ratio * 100));

        return bar.toString();

    }

}