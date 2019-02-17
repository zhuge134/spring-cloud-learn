package com.zhuge.spring.cloud.learn.feign.service;

import org.springframework.stereotype.Component;

@Component
public class HiServiceFallback implements HiService {
    @Override
    public String hi(String name) {
        return "can not access service:service-hi,sorry!";
    }
}
