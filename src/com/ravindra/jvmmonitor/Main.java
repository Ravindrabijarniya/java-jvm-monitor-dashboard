package com.ravindra.jvmmonitor;

import java.util.List;

import com.ravindra.jvmmonitor.model.GCInfo;
import com.ravindra.jvmmonitor.model.MemoryInfo;
import com.ravindra.jvmmonitor.model.OSInfo;
import com.ravindra.jvmmonitor.model.RuntimeInfo;
import com.ravindra.jvmmonitor.model.ThreadInfo;
import com.ravindra.jvmmonitor.service.MonitoringService;

public class Main {

    public static void main(String[] args) {

        MonitoringService service = new MonitoringService();

        RuntimeInfo runtime = service.getRuntimeInfo();
        MemoryInfo memory = service.getMemoryInfo();
        ThreadInfo thread = service.getThreadInfo();
        OSInfo os = service.getOSInfo();
        List<GCInfo> gcList = service.getGCInfo();

        System.out.println("========== JVM Runtime ==========");
        System.out.println("VM Name       : " + runtime.getVmName());
        System.out.println("VM Vendor     : " + runtime.getVmVendor());
        System.out.println("VM Version    : " + runtime.getVmVersion());
        System.out.println("Uptime (ms)   : " + runtime.getUptime());

        System.out.println("\n========== Memory ==========");
        System.out.println("Heap Used     : " + memory.getHeapUsed());
        System.out.println("Heap Max      : " + memory.getHeapMax());
        System.out.println("Non Heap Used : " + memory.getNonHeapUsed());

        System.out.println("\n========== Threads ==========");
        System.out.println("Current       : " + thread.getThreadCount());
        System.out.println("Peak          : " + thread.getPeakThreadCount());
        System.out.println("Daemon        : " + thread.getDaemonThreadCount());

        System.out.println("\n========== Operating System ==========");
        System.out.println("OS            : " + os.getOsName());
        System.out.println("Version       : " + os.getOsVersion());
        System.out.println("Architecture  : " + os.getArchitecture());
        System.out.println("Processors    : " + os.getAvailableProcessors());
        System.out.println("Load Average  : " + os.getSystemLoadAverage());

        System.out.println("\n========== Garbage Collectors ==========");

        for (GCInfo gc : gcList) {

            System.out.println("------------------------------------");
            System.out.println("Name          : " + gc.getName());
            System.out.println("Collections   : " + gc.getCollectionCount());
            System.out.println("Time (ms)     : " + gc.getCollectionTime());
        }

    }

}