package com.cc.springcloud.congif;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : chencheng
 * @Date : 2021/10/15 11:22
 */
@Configuration
public class ApplicationContextConfig {
    /**
     * LoadBalanced 负载均衡
     */
    @Bean
//    @LoadBalanced  使用自己写的负载均衡
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
//applicationContext.xml <bean id="" class="">
