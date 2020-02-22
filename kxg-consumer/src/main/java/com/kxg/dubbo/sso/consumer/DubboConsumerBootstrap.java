package com.kxg.dubbo.sso.consumer;

import com.kxg.dubbo.sso.DemoService;

import org.apache.dubbo.config.annotation.Reference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
public class DubboConsumerBootstrap {

    private final Logger logger = LoggerFactory.getLogger(getClass());


    @Reference(version = "1.0.0")

    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerBootstrap.class);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> logger.info(demoService.sayHello("Provider"));
    }
}
