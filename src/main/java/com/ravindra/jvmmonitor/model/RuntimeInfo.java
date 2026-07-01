package main.java.com.ravindra.jvmmonitor.model;

import java.util.List;

public class RuntimeInfo {

    private String vmName;
    private String vmVendor;
    private String vmVersion;
    private long startTime;
    private long uptime;
    private List<String> inputArguments;

    public RuntimeInfo() {
    }

    public RuntimeInfo(String vmName,
            String vmVendor,
            String vmVersion,
            long startTime,
            long uptime,
            List<String> inputArguments) {
        this.vmName = vmName;
        this.vmVendor = vmVendor;
        this.vmVersion = vmVersion;
        this.startTime = startTime;
        this.uptime = uptime;
        this.inputArguments = inputArguments;
    }

    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    public String getVmVendor() {
        return vmVendor;
    }

    public void setVmVendor(String vmVendor) {
        this.vmVendor = vmVendor;
    }

    public String getVmVersion() {
        return vmVersion;
    }

    public void setVmVersion(String vmVersion) {
        this.vmVersion = vmVersion;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getUptime() {
        return uptime;
    }

    public void setUptime(long uptime) {
        this.uptime = uptime;
    }

    public List<String> getInputArguments() {
        return inputArguments;
    }

    public void setInputArguments(List<String> inputArguments) {
        this.inputArguments = inputArguments;
    } 
}
