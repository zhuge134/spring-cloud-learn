package com.zhuge.spring.cloud.learn.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: RestController
 * @Description:
 * @author: zhuge
 * @date: 2019/1/4 21:50
 */
@RestController
@RequestMapping(path = "/example")
public class RestControllerExample {

    @Value("${server.port}")
    private int port;

    @Value("${spring.application.name}")
    private String appName;

    @Value("${localhost}")
    private String host;

    @GetMapping(path = "/home")
    public String home(@RequestParam(value = "name", defaultValue = "noone") String name) {
        return String.format("Hi: %s,  ,i am from service: %s, url:%s:%d",
                name, appName, host, port);
    }
}
