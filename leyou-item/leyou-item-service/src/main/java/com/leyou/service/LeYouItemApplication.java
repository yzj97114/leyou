package com.leyou.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * description: LeYouItemApplication <br>
 * date: 2020/1/4 21:00 <br>
 * version: 1.0 <br>
 *
 * @author: 79282 <br>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LeYouItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeYouItemApplication.class, args);
    }
}
