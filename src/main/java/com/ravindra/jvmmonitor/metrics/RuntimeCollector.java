package main.java.com.ravindra.jvmmonitor.metrics;

import main.java.com.ravindra.jvmmonitor.model.RuntimeInfo;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class RuntimeCollector {

    public RuntimeInfo collect() {

        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();

        return new RuntimeInfo(
                runtimeMXBean.getVmName(),
                runtimeMXBean.getVmVendor(),
                runtimeMXBean.getVmVersion(),
                runtimeMXBean.getStartTime(),
                runtimeMXBean.getUptime(),
                runtimeMXBean.getInputArguments());
    }
}
