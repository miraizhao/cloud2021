package com.riying.springcoud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Mirai Zhao
 * @create 2021-06-24
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced//RestTemplate负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
