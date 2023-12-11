package com.example.democonsuleproducer.service;

import com.example.democonsulapi.api.BizService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DubboService
public class BizServiceImpl implements BizService {

    private Logger logger = LoggerFactory.getLogger(BizServiceImpl.class);
    @Override
    public String doSomeThing() {
        logger.info("(ribbon zookeeper)someone call me ");
        return "i am dubbo producer";
    }
}
