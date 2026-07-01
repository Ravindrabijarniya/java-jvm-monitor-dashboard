package com.ravindra.jvmmonitor.metrics;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.List;

import com.ravindra.jvmmonitor.model.MemoryPoolInfo;

public class MemoryPoolCollector {

    public List<MemoryPoolInfo> collect() {

        List<MemoryPoolInfo> pools = new ArrayList<>();

        for (MemoryPoolMXBean bean : ManagementFactory.getMemoryPoolMXBeans()) {

            MemoryUsage usage = bean.getUsage();

            if (usage != null) {

                pools.add(

                        new MemoryPoolInfo(

                                bean.getName(),

                                usage.getUsed(),

                                usage.getCommitted(),

                                usage.getMax()

                        )

                );

            }

        }

        return pools;

    }

}