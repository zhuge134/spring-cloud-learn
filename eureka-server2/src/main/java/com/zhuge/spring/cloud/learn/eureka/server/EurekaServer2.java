package com.zhuge.spring.cloud.learn.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Title: MyApp
 * @Description:
 * @author: zhuge
 * @date: 2019/1/19 22:14
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer2.class, args);
    }
}
