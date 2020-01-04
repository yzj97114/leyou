package com.leyou.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * description: LeYouApiGateWayApplication zuul<br>
 * date: 2020/1/4 20:44 <br>
 * @author: 79282 <br>
 * version: 1.0 <br>
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class LeYouApiGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeYouApiGateWayApplication.class, args);
    }
}
