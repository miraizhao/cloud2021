package com.riying.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Mirai Zhao
 * @create: 2021-07-14  10:28
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83 {
    public static void main(String[] args) {
            SpringApplication.run(OrderNacosMain83.class,args);
        }
}
