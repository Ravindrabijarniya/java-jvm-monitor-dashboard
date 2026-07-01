package com.ravindra.jvmmonitor.model;

public class OSInfo {

    private String osName;
    private String osVersion;
    private String architecture;
    private int availableProcessors;
    private double systemLoadAverage;

    public OSInfo() {
    }

    public OSInfo(String osName,
            String osVersion,
            String architecture,
            int availableProcessors,
            double systemLoadAverage) {

        this.osName = osName;
        this.osVersion = osVersion;
        this.architecture = architecture;
        this.availableProcessors = availableProcessors;
        this.systemLoadAverage = systemLoadAverage;
    }

    public String getOsName() {
        return osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String getArchitecture() {
        return architecture;
    }

    public int getAvailableProcessors() {
        return availableProcessors;
    }

    public double getSystemLoadAverage() {
        return systemLoadAverage;
    }
}