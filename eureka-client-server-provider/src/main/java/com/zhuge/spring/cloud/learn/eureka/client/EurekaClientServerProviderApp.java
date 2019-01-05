package com.zhuge.spring.cloud.learn.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Title: EurekaClientServerProviderApp
 * @Description:
 * @author: zhuge
 * @date: 2019/1/4 21:46
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientServerProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientServerProviderApp.class, args);
    }
}
