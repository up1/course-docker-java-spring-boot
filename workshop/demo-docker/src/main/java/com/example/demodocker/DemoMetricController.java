package com.example.demodocker;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoMetricController {

    static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    private final MeterRegistry meterRegistry;

    @Autowired
    public DemoMetricController(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @GetMapping("/action/success")
    public String success() {

        Counter counter = Counter
                .builder("hello-springboot")
                .description("Success case")
                .tag("result", "success")
                .register(meterRegistry);
        counter.increment();
        return "Hello RESTFul API from Spring boot";
    }

    @GetMapping("/action/error")
    public String error() {
        Counter counter = Counter
                .builder("hello-springboot")
                .description("Error case")
                .tag("result", "error")
                .register(meterRegistry);
        counter.increment();
        return "Error";
    }

}
