package com.zhuge.spring.cloud.learn.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-ribbon", fallback = HiServiceFallback.class)
public interface HiService {

    @GetMapping(path = "/ribbon/hi")
    public String hi(@RequestParam(name = "name") String name);
}
