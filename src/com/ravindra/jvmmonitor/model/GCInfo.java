package com.ravindra.jvmmonitor.model;

public class GCInfo {

    private String name;
    private long collectionCount;
    private long collectionTime;

    public GCInfo() {
    }

    public GCInfo(String name,
            long collectionCount,
            long collectionTime) {

        this.name = name;
        this.collectionCount = collectionCount;
        this.collectionTime = collectionTime;
    }

    public String getName() {
        return name;
    }

    public long getCollectionCount() {
        return collectionCount;
    }

    public long getCollectionTime() {
        return collectionTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollectionCount(long collectionCount) {
        this.collectionCount = collectionCount;
    }

    public void setCollectionTime(long collectionTime) {
        this.collectionTime = collectionTime;
    }
}