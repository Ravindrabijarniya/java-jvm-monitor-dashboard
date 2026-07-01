package com.ravindra.jvmmonitor.model;

import java.util.List;

public class DashboardSnapshot {

    private RuntimeInfo runtimeInfo;
    private MemoryInfo memoryInfo;
    private ThreadInfo threadInfo;
    private OSInfo osInfo;
    private List<GCInfo> gcInfo;

    public DashboardSnapshot() {
    }

    public DashboardSnapshot(RuntimeInfo runtimeInfo,
            MemoryInfo memoryInfo,
            ThreadInfo threadInfo,
            OSInfo osInfo,
            List<GCInfo> gcInfo) {

        this.runtimeInfo = runtimeInfo;
        this.memoryInfo = memoryInfo;
        this.threadInfo = threadInfo;
        this.osInfo = osInfo;
        this.gcInfo = gcInfo;
    }

    public RuntimeInfo getRuntimeInfo() {
        return runtimeInfo;
    }

    public MemoryInfo getMemoryInfo() {
        return memoryInfo;
    }

    public ThreadInfo getThreadInfo() {
        return threadInfo;
    }

    public OSInfo getOsInfo() {
        return osInfo;
    }

    public List<GCInfo> getGcInfo() {
        return gcInfo;
    }
}