package com.custardsource.parfait.timing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadMetricSuite {
    private final List<ThreadMetric> metrics = new ArrayList<ThreadMetric>(StandardThreadMetrics
            .defaults());
    
    public final void addMetric(ThreadMetric metric) {
        metrics.add(metric);
    }
    
    public final List<ThreadMetric> metrics() {
        return Collections.unmodifiableList(metrics);
    }

}
