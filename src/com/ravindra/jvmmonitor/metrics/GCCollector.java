package com.ravindra.jvmmonitor.metrics;

import com.ravindra.jvmmonitor.model.GCInfo;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

public class GCCollector {

    public List<GCInfo> collect() {

        List<GCInfo> gcInfoList = new ArrayList<>();

        List<GarbageCollectorMXBean> collectors = ManagementFactory.getGarbageCollectorMXBeans();

        for (GarbageCollectorMXBean collector : collectors) {

            gcInfoList.add(

                    new GCInfo(

                            collector.getName(),

                            collector.getCollectionCount(),

                            collector.getCollectionTime()

                    )

            );

        }

        return gcInfoList;

    }

}