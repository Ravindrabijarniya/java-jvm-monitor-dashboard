package com.ravindra.jvmmonitor.dashboard;

import java.util.List;

import com.ravindra.jvmmonitor.model.DashboardSnapshot;
import com.ravindra.jvmmonitor.model.GCInfo;
import com.ravindra.jvmmonitor.model.MemoryInfo;
import com.ravindra.jvmmonitor.model.OSInfo;
import com.ravindra.jvmmonitor.model.RuntimeInfo;
import com.ravindra.jvmmonitor.model.ThreadInfo;
import com.ravindra.jvmmonitor.service.MonitoringService;
import com.ravindra.jvmmonitor.util.MemoryUtil;
import com.ravindra.jvmmonitor.util.ProgressBarUtil;
import com.ravindra.jvmmonitor.util.TimeUtil;

public class DashboardRenderer {

    private final MonitoringService service;

    public DashboardRenderer(MonitoringService service) {
        this.service = service;
    }

    public void render() {

        DashboardSnapshot snapshot = service.collectSnapshot();

        RuntimeInfo runtime = snapshot.getRuntimeInfo();
        MemoryInfo memory = snapshot.getMemoryInfo();
        ThreadInfo thread = snapshot.getThreadInfo();
        OSInfo os = snapshot.getOsInfo();
        List<GCInfo> gcList = snapshot.getGcInfo();

        System.out.println("==========================================================");
        System.out.println("                 JVM MONITOR DASHBOARD");
        System.out.println("==========================================================");

        System.out.println("Time      : " + TimeUtil.now());
        System.out.println("Uptime    : " + TimeUtil.formatUptime(runtime.getUptime()));

        System.out.println("\n----------------------------------------------------------");
        System.out.println("MEMORY");
        System.out.println("----------------------------------------------------------");
        System.out.println("Heap Used : " + MemoryUtil.format(memory.getHeapUsed()));
        System.out.println("Heap Max  : " + MemoryUtil.format(memory.getHeapMax()));
        System.out.println(ProgressBarUtil.build(
                memory.getHeapUsed(),
                memory.getHeapMax()));

        System.out.println("\n----------------------------------------------------------");
        System.out.println("THREADS");
        System.out.println("----------------------------------------------------------");
        System.out.println("Current   : " + thread.getThreadCount());
        System.out.println("Peak      : " + thread.getPeakThreadCount());
        System.out.println("Daemon    : " + thread.getDaemonThreadCount());

        System.out.println("\n----------------------------------------------------------");
        System.out.println("OPERATING SYSTEM");
        System.out.println("----------------------------------------------------------");
        System.out.println("OS         : " + os.getOsName());
        System.out.println("Version    : " + os.getOsVersion());
        System.out.println("Architecture : " + os.getArchitecture());
        System.out.println("Processors : " + os.getAvailableProcessors());
        System.out.println("Load Avg   : " + os.getSystemLoadAverage());

        System.out.println("\n----------------------------------------------------------");
        System.out.println("GARBAGE COLLECTORS");
        System.out.println("----------------------------------------------------------");

        for (GCInfo gc : gcList) {

            System.out.println("Name        : " + gc.getName());
            System.out.println("Collections : " + gc.getCollectionCount());
            System.out.println("Time (ms)   : " + gc.getCollectionTime());
            System.out.println();

        }

        System.out.println("==========================================================");
    }
}