package com.zhuge.spring.cloud.learn.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: HiService
 * @Description:
 * @author: zhuge
 * @date: 2019/1/5 18:45
 */
@Service
@ConfigurationProperties(prefix = "services.service-hi")
public class HiService {

    @Autowired
    private RestTemplate restTemplate;

    private String hiUrl;

    public String hi(String name) {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(
                hiUrl + "?name={ name}", String.class, "zhuge");

        return responseEntity.getBody() + "\ncomes from " + hiUrl;
    }

    public String getHiUrl() {
        return hiUrl;
    }

    public void setHiUrl(String hiUrl) {
        this.hiUrl = hiUrl;
    }
}
