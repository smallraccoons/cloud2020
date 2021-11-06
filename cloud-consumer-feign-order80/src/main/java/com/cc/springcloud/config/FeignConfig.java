package com.cc.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : chencheng
 * @Date : 2021/10/31 15:09
 */
@Configuration
public class FeignConfig {
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
