package com.ravindra.jvmmonitor.model;

public class ClassLoadingInfo {

    private int loadedClassCount;
    private long totalLoadedClassCount;
    private long unloadedClassCount;

    public ClassLoadingInfo() {
    }

    public ClassLoadingInfo(int loadedClassCount,
            long totalLoadedClassCount,
            long unloadedClassCount) {

        this.loadedClassCount = loadedClassCount;
        this.totalLoadedClassCount = totalLoadedClassCount;
        this.unloadedClassCount = unloadedClassCount;
    }

    public int getLoadedClassCount() {
        return loadedClassCount;
    }

    public long getTotalLoadedClassCount() {
        return totalLoadedClassCount;
    }

    public long getUnloadedClassCount() {
        return unloadedClassCount;
    }
}