package com.zhuge.spring.cloud.learn.ribbon;

import com.zhuge.spring.cloud.learn.ribbon.service.HiService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: EurekaClientRibbon
 * @Description:
 * @author: zhuge
 * @date: 2019/1/5 18:35
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties({HiService.class})
public class EurekaClientRibbon {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientRibbon.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
