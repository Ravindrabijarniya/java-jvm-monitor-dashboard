package main.java.com.ravindra.jvmmonitor;

import main.java.com.ravindra.jvmmonitor.metrics.MemoryCollector;
import main.java.com.ravindra.jvmmonitor.metrics.RuntimeCollector;
import main.java.com.ravindra.jvmmonitor.metrics.ThreadCollector;
import main.java.com.ravindra.jvmmonitor.model.MemoryInfo;
import main.java.com.ravindra.jvmmonitor.model.RuntimeInfo;
import main.java.com.ravindra.jvmmonitor.model.ThreadInfo;

public class Main {
    public static void main(String[] args) {

        RuntimeCollector runtimeCollector = new RuntimeCollector();
        RuntimeInfo runtime = runtimeCollector.collect();

        MemoryCollector memoryCollector = new MemoryCollector();
        MemoryInfo memory = memoryCollector.collect();

        ThreadCollector threadCollector = new ThreadCollector();
        ThreadInfo thread = threadCollector.collect();

        System.out.println("========== JVM Runtime ==========");
        System.out.println("VM Name       : " + runtime.getVmName());
        System.out.println("VM Vendor     : " + runtime.getVmVendor());
        System.out.println("VM Version    : " + runtime.getVmVersion());
        System.out.println("Start Time    : " + runtime.getStartTime());
        System.out.println("Uptime (ms)   : " + runtime.getUptime());
        System.out.println("Arguments     : " + runtime.getInputArguments());

        System.out.println("\n========== Memory ==========");
        System.out.println("Heap Used         : " + memory.getHeapUsed());
        System.out.println("Heap Committed    : " + memory.getHeapCommitted());
        System.out.println("Heap Max          : " + memory.getHeapMax());
        System.out.println("Non Heap Used     : " + memory.getNonHeapUsed());
        System.out.println("Non Heap Committed: " + memory.getNonHeapCommitted());

        System.out.println("\n========== Threads ==========");
        System.out.println("Current Threads : " + thread.getThreadCount());
        System.out.println("Peak Threads    : " + thread.getPeakThreadCount());
        System.out.println("Daemon Threads  : " + thread.getDaemonThreadCount());
        System.out.println("Total Started   : " + thread.getTotalStartedThreadCount());
    }
}
