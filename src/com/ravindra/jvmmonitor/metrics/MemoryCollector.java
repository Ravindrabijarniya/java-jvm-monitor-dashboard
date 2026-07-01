package com.ravindra.jvmmonitor.metrics;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

import com.ravindra.jvmmonitor.model.MemoryInfo;

public class MemoryCollector {

    public MemoryInfo collect() {

        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();

        MemoryUsage heap = memoryMXBean.getHeapMemoryUsage();

        MemoryUsage nonHeap = memoryMXBean.getNonHeapMemoryUsage();

        return new MemoryInfo(

                heap.getUsed(),

                heap.getCommitted(),

                heap.getMax(),

                nonHeap.getUsed(),

                nonHeap.getCommitted()

        );
    }
    
}
