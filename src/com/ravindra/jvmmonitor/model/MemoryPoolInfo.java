package com.ravindra.jvmmonitor.model;

public class MemoryPoolInfo {

    private String name;
    private long used;
    private long committed;
    private long max;

    public MemoryPoolInfo() {
    }

    public MemoryPoolInfo(String name,
            long used,
            long committed,
            long max) {

        this.name = name;
        this.used = used;
        this.committed = committed;
        this.max = max;
    }

    public String getName() {
        return name;
    }

    public long getUsed() {
        return used;
    }

    public long getCommitted() {
        return committed;
    }

    public long getMax() {
        return max;
    }
}