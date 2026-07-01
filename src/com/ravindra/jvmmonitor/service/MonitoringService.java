package com.ravindra.jvmmonitor.service;

import com.ravindra.jvmmonitor.model.GCInfo;
import com.ravindra.jvmmonitor.model.MemoryInfo;
import com.ravindra.jvmmonitor.model.OSInfo;
import com.ravindra.jvmmonitor.model.RuntimeInfo;
import com.ravindra.jvmmonitor.model.ThreadInfo;

import java.util.List;

import com.ravindra.jvmmonitor.metrics.GCCollector;
import com.ravindra.jvmmonitor.metrics.MemoryCollector;
import com.ravindra.jvmmonitor.metrics.OSCollector;
import com.ravindra.jvmmonitor.metrics.RuntimeCollector;
import com.ravindra.jvmmonitor.metrics.ThreadCollector;


public class MonitoringService {

    private final RuntimeCollector runtimeCollector;
    private final MemoryCollector memoryCollector;
    private final ThreadCollector threadCollector;
    private final GCCollector gcCollector;
    private final OSCollector osCollector;
    

    public MonitoringService() {

        runtimeCollector = new RuntimeCollector();
        memoryCollector = new MemoryCollector();
        threadCollector = new ThreadCollector();
        gcCollector = new GCCollector();
        osCollector = new OSCollector();

    }

     public RuntimeInfo getRuntimeInfo() {
        return runtimeCollector.collect();
    }

    public MemoryInfo getMemoryInfo() {
        return memoryCollector.collect();
    }

    public ThreadInfo getThreadInfo() {
        return threadCollector.collect();
    }
    
    public List<GCInfo> getGCInfo() {
        return gcCollector.collect();
    }

    public OSInfo getOSInfo() {
    return osCollector.collect();
}

}
