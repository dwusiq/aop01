package com.wusiq.config;

import com.wusiq.aspect.AroundLog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * spring的java配置
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.wusiq")
public class javaConfig {

    @Bean
    public AroundLog aroundlog(){
        return new AroundLog();
    }
}
