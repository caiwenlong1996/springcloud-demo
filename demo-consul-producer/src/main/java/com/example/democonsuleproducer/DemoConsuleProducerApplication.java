package com.example.democonsuleproducer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableDubbo(scanBasePackages = "com.example.democonsuleproducer.service") //dubbo包扫描
public class DemoConsuleProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConsuleProducerApplication.class, args);
    }

}
