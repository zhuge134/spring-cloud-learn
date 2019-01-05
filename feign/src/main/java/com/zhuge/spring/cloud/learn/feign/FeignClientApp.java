package com.zhuge.spring.cloud.learn.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Title: FeignClientApp
 * @Description:
 * @author: zhuge
 * @date: 2019/1/5 20:28
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignClientApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignClientApp.class, args);
    }
}
