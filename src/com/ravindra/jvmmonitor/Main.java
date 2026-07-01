package com.ravindra.jvmmonitor;

import com.ravindra.jvmmonitor.dashboard.DashboardRenderer;
import com.ravindra.jvmmonitor.exporter.CSVExporter;
import com.ravindra.jvmmonitor.exporter.TextExporter;
import com.ravindra.jvmmonitor.model.DashboardSnapshot;
import com.ravindra.jvmmonitor.service.MonitoringService;
import com.ravindra.jvmmonitor.util.ConsoleUtil;

public class Main {

    public static void main(String[] args)
            throws InterruptedException {

        MonitoringService service = new MonitoringService();

        DashboardRenderer dashboard = new DashboardRenderer(service);

        DashboardSnapshot snapshot = service.collectSnapshot();

        TextExporter txtExporter = new TextExporter();

        CSVExporter csvExporter = new CSVExporter();

        txtExporter.export(snapshot);

        csvExporter.export(snapshot);

        while (true) {

            ConsoleUtil.clearConsole();

            dashboard.render();

            Thread.sleep(2000);

        }

    }

}