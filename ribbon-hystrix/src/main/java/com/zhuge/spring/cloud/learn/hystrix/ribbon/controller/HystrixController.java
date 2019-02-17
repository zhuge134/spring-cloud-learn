package com.zhuge.spring.cloud.learn.hystrix.ribbon.controller;

import com.zhuge.spring.cloud.learn.hystrix.ribbon.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: HystrixController
 * @Description:
 * @author: zhuge
 * @date: 2019/1/6 14:38
 */
@RestController
@RequestMapping(path = "/hystrix")
public class HystrixController {

    @Autowired
    private HystrixService service;

    @GetMapping(path = "/hi")
    public String hi(@RequestParam(name = "name", defaultValue = "nameless") String name) {
        return service.hi(name);
    }
}
