package com.example.democonsulconsumer.controller;

import com.example.democonsulapi.api.BizService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/biz")
public class BizController {

    @DubboReference
    private BizService bizService;

    private Logger logger = LoggerFactory.getLogger(BizController.class);

    @GetMapping("doSomeThing")
    public void doSomeThing(){
        String result = bizService.doSomeThing();
        logger.info("(dubbo consul)result that you get from producer is: "+result);
    }
}
