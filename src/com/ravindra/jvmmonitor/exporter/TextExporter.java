package com.ravindra.jvmmonitor.exporter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.ravindra.jvmmonitor.model.DashboardSnapshot;

public class TextExporter {

    public void export(DashboardSnapshot snapshot) {

        try (PrintWriter writer = new PrintWriter(
                new FileWriter(
                        "MonitoringReport.txt"))) {

            writer.println("====================================");
            writer.println("      JVM Monitoring Report");
            writer.println("====================================");

            writer.println();

            writer.println("VM Name : "
                    + snapshot.getRuntimeInfo().getVmName());

            writer.println("Uptime : "
                    + snapshot.getRuntimeInfo().getUptime());

            writer.println();

            writer.println("Heap Used : "
                    + snapshot.getMemoryInfo().getHeapUsed());

            writer.println("Heap Max : "
                    + snapshot.getMemoryInfo().getHeapMax());

            writer.println();

            writer.println("Threads : "
                    + snapshot.getThreadInfo().getThreadCount());

            writer.println("Processors : "
                    + snapshot.getOsInfo().getAvailableProcessors());

            writer.println();

            snapshot.getGcInfo().forEach(gc -> {

                writer.println(gc.getName());

                writer.println(
                        "Collections : "
                                + gc.getCollectionCount());

                writer.println(
                        "Time : "
                                + gc.getCollectionTime());

                writer.println();

            });

            writer.println("====================================");

            System.out.println(
                    "Text report exported successfully.");

        }

        catch (IOException e) {

            e.printStackTrace();

        }

    }

}