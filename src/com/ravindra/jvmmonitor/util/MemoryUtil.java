package com.ravindra.jvmmonitor.util;

public class MemoryUtil {

    private MemoryUtil() {
    }

    public static String format(long bytes) {

        double kb = bytes / 1024.0;
        double mb = kb / 1024.0;
        double gb = mb / 1024.0;

        if (gb >= 1)
            return String.format("%.2f GB", gb);

        if (mb >= 1)
            return String.format("%.2f MB", mb);

        if (kb >= 1)
            return String.format("%.2f KB", kb);

        return bytes + " Bytes";

    }

}