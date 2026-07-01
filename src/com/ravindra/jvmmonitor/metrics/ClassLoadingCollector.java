package com.ravindra.jvmmonitor.metrics;

import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;

import com.ravindra.jvmmonitor.model.ClassLoadingInfo;

public class ClassLoadingCollector {

    public ClassLoadingInfo collect() {

        ClassLoadingMXBean bean = ManagementFactory.getClassLoadingMXBean();

        return new ClassLoadingInfo(

                bean.getLoadedClassCount(),

                bean.getTotalLoadedClassCount(),

                bean.getUnloadedClassCount()

        );

    }

}