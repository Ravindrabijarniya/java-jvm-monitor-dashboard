package com.ravindra.jvmmonitor.metrics;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

import com.ravindra.jvmmonitor.model.ThreadInfo;

public class ThreadCollector {

    public ThreadInfo collect() {

        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

        return new ThreadInfo(

                threadMXBean.getThreadCount(),

                threadMXBean.getPeakThreadCount(),

                threadMXBean.getDaemonThreadCount(),

                threadMXBean.getTotalStartedThreadCount()

        );
    }

}
