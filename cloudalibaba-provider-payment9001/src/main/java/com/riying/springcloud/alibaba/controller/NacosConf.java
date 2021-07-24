package com.riying.springcloud.alibaba.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Mirai Zhao
 * @create: 2021-07-15  18:46
 * @Description:
 */
@Data
@Configuration
public class NacosConf {

    @Value("${config.info}")
    private String str;
}
