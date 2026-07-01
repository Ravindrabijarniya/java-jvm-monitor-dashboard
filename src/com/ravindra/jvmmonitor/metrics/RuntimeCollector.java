package com.ravindra.jvmmonitor.metrics;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

import com.ravindra.jvmmonitor.model.RuntimeInfo;

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
