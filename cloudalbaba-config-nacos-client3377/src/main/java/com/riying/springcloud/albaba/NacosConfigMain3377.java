package com.riying.springcloud.albaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Mirai Zhao
 * @create: 2021-07-14  11:42
 * @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigMain3377 {
    public static void main(String[] args) {
            SpringApplication.run(NacosConfigMain3377.class,args);
        }
}
