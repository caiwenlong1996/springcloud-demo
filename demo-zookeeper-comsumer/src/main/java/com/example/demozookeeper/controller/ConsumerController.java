package com.example.demozookeeper.controller;

import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    public static final String INVOKE__URL = "http://demo-zookeeper-producer";

    private Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("doSomething")
    public void doSomething(){
        String result = restTemplate.getForObject(INVOKE__URL + "/producer/getSomething", String.class);
        logger.info("(ribbon zookeeper)result that you get from producer is: "+result);
    }
}
