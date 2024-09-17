package com.example.demo.metrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class CustomMetrics {
    private final Counter myCustomCounter;

    public CustomMetrics(MeterRegistry registry) {
        myCustomCounter = Counter.builder("custom.service.calls")
                .description("Number of calls to custom service")
                .register(registry);
    }

    public void increment() {
        myCustomCounter.increment();
    }
}