package com.riying.springloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mirai Zhao
 * @create 2021-06-30
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
//        http://news.baidu.com/guonei  guoji
        RouteLocatorBuilder.Builder builder = routeLocatorBuilder.routes();
        builder.route("path_route_riying",r->r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return builder.build();
    }
    @Bean
    public RouteLocator customerRouteLocator2(RouteLocatorBuilder routeLocatorBuilder){
//        http://news.baidu.com/guonei  guoji
        RouteLocatorBuilder.Builder builder = routeLocatorBuilder.routes();
        builder.route("path_route_riying2",r->r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
        return builder.build();
    }
}
