package com.zhuge.spring.cloud.learn.zipkin1;

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
 * @Title: Zipkin1
 * @Description:
 * @author: zhuge
 * @date: 2019/1/19 23:12
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
@RequestMapping("/zipkin1")
public class Zipkin1 {
    public static void main(String[] args) {
        SpringApplication.run(Zipkin1.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "hi")
    public String hi() {
        return restTemplate.getForEntity(
                "http://localhost:9162/zipkin2/hi", String.class, "zipkin2").getBody();
    }

    @GetMapping(path = "/hi2")
    public String hi2() {
        return "hi, im hi2 interface from service zipkin1";
    }
}
