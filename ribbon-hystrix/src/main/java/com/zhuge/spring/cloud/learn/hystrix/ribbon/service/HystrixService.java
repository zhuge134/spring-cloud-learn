package com.zhuge.spring.cloud.learn.hystrix.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: HystrixService
 * @Description:
 * @author: zhuge
 * @date: 2019/1/6 14:22
 */
@Service
public class HystrixService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${serviceInfo.serviceName}")
    private String serviceName;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name) {
        return restTemplate.getForObject(
                String.format("http://{serviceName}/example/home?name={name}"),
                String.class, serviceName, name);
    }

    public String hiError(String name){
        return String.format("can not access service:%s, sorry!",serviceName);
    }
}
