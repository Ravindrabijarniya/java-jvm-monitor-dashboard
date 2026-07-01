package com.ravindra.jvmmonitor.metrics;

import com.ravindra.jvmmonitor.model.OSInfo;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class OSCollector {

    public OSInfo collect() {

        OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();

        return new OSInfo(

                os.getName(),

                os.getVersion(),

                os.getArch(),

                os.getAvailableProcessors(),

                os.getSystemLoadAverage()

        );

    }

}