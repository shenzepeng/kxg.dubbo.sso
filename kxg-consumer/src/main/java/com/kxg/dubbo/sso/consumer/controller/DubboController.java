package com.kxg.dubbo.sso.consumer.controller;

import com.kxg.dubbo.sso.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {
    @Reference(version = "1.0.0")
    private DemoService demoService;
    @GetMapping("dubbo")
    public String getHelloDubbo(String name){
        return demoService.sayHello(name);
    }
}
