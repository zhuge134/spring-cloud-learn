package com.zhuge.spring.cloud.learn.feign.controller;

import com.zhuge.spring.cloud.learn.feign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: HiConreoller
 * @Description:
 * @author: zhuge
 * @date: 2019/1/5 20:58
 */
@RestController
@RequestMapping(path = "/feign")
public class HiConreoller {

    @Autowired
    private HiService hiService;

    @GetMapping(path = "/hi")
    public String hi(@RequestParam(name = "name", defaultValue = "noone") String name) {
        return hiService.hi(name)+"\ncomes from service-ribbon";
    }
}
