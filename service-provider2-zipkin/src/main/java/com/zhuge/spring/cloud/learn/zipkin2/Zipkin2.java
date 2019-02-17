package com.zhuge.spring.cloud.learn.zipkin2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: Zipkin2
 * @Description:
 * @author: zhuge
 * @date: 2019/1/19 23:24
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@RestController
@RequestMapping(path = "/zipkin2")
public class Zipkin2 {
    public static void main(String[] args) {
        SpringApplication.run(Zipkin2.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/hi")
    public String hi() {
        return restTemplate.getForEntity("http://localhost:9161/zipkin1/hi2",String.class).getBody();
    }
}
