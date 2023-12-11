package com.example.demozookeeper.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/producer")
public class ProducerController {

    private Logger logger = LoggerFactory.getLogger(ProducerController.class);

    @GetMapping("/getSomething")
    public String getSomething(){
        logger.info("(ribbon zookeeper)someone call me ");
        return "you get a string";
    }
}
