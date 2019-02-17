package com.zhuge.spring.cloud.learn.config.client;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping
public class controller {

    @Value("${env.user:config env.user not found from config server}")
    private String user;

    @Value("${env.age:config env.age not found from config server}")
    private int age;

    @GetMapping(path = "/hi")
    public String userInfo() {
        return user + age;
    }
}
