package com.ravindra.jvmmonitor.model;

public class MemoryInfo {
    private long heapUsed;
    private long heapCommitted;
    private long heapMax;

    private long nonHeapUsed;
    private long nonHeapCommitted;

    public MemoryInfo() {
    }

    public MemoryInfo(long heapUsed,
            long heapCommitted,
            long heapMax,
            long nonHeapUsed,
            long nonHeapCommitted) {

        this.heapUsed = heapUsed;
        this.heapCommitted = heapCommitted;
        this.heapMax = heapMax;
        this.nonHeapUsed = nonHeapUsed;
        this.nonHeapCommitted = nonHeapCommitted;
    }

    // getters and setters
    public long getHeapUsed() {
        return heapUsed;
    }
    
    public void setHeapUsed(long heapUsed) {
        this.heapUsed = heapUsed;
    }
    
    public long getHeapCommitted() {
        return heapCommitted;
    }

    public void setHeapCommitted(long heapCommitted) {
        this.heapCommitted = heapCommitted;
    }

    public long getHeapMax() {
        return heapMax;
    }

    public void setHeapMax(long heapMax) {
        this.heapMax = heapMax;
    }

    public long getNonHeapUsed() {
        return nonHeapUsed;
    }

    public void setNonHeapUsed(long nonHeapUsed) {
        this.nonHeapUsed = nonHeapUsed;
    }

    public long getNonHeapCommitted() {
        return nonHeapCommitted;
    }

    public void setNonHeapCommitted(long nonHeapCommitted) {
        this.nonHeapCommitted = nonHeapCommitted;
    }

}