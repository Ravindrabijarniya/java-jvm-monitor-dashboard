package main.java.com.ravindra.jvmmonitor.metrics;

import main.java.com.ravindra.jvmmonitor.model.MemoryInfo;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

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
