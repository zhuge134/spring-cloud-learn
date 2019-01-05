package com.zhuge.spring.cloud.learn.ribbon.controller;

import com.zhuge.spring.cloud.learn.ribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ribbon")
public class HiController {

    @Autowired
    private HiService hiService;

    @GetMapping(path = "/hi")
    public String hi(@RequestParam(name = "name", defaultValue = "noone") String name) {
        return hiService.hi(name);
    }
}
