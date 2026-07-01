package com.ravindra.jvmmonitor.exporter;

import java.io.FileWriter;
import java.io.IOException;

import com.ravindra.jvmmonitor.model.DashboardSnapshot;

public class CSVExporter {

    public void export(DashboardSnapshot snapshot) {

        try (FileWriter writer = new FileWriter("MonitoringReport.csv")) {

            writer.append("Metric,Value\n");

            writer.append("VM Name,")
                    .append(snapshot.getRuntimeInfo().getVmName())
                    .append("\n");

            writer.append("Uptime,")
                    .append(String.valueOf(
                            snapshot.getRuntimeInfo().getUptime()))
                    .append("\n");

            writer.append("Heap Used,")
                    .append(String.valueOf(
                            snapshot.getMemoryInfo().getHeapUsed()))
                    .append("\n");

            writer.append("Heap Max,")
                    .append(String.valueOf(
                            snapshot.getMemoryInfo().getHeapMax()))
                    .append("\n");

            writer.append("Threads,")
                    .append(String.valueOf(
                            snapshot.getThreadInfo().getThreadCount()))
                    .append("\n");

            writer.append("Processors,")
                    .append(String.valueOf(
                            snapshot.getOsInfo().getAvailableProcessors()))
                    .append("\n");

            writer.flush();

            System.out.println(
                    "CSV report exported successfully.");

        }

        catch (IOException e) {

            e.printStackTrace();

        }

    }

}