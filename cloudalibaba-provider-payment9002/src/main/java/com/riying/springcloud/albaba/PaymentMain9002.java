package com.riying.springcloud.albaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Mirai Zhao
 * @create: 2021-07-14  10:08
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {
    public static void main(String[] args) {
            SpringApplication.run(PaymentMain9002.class,args);
        }
}
