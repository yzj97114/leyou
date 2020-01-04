package com.leyou.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * description: LeYouRegistryApplication 注册中心<br>
 * date: 2020/1/4 20:36 <br>
 * @author: 79282 <br>
 * version: 1.0 <br>
 */
@SpringBootApplication
@EnableEurekaServer
public class LeYouRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeYouRegistryApplication.class, args);
    }
}
