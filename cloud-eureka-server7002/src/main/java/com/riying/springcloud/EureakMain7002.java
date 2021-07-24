package com.riying.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Mirai Zhao
 * @create 2021-06-24
 */
@SpringBootApplication
@EnableEurekaServer
public class EureakMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EureakMain7002.class,args);
    }

}
