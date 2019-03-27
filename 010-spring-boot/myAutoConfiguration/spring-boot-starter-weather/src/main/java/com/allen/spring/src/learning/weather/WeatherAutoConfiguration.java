package com.allen.spring.src.learning.weather;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: allengent@163.com
 * @Date: 2019/3/26 18:02
 */

@Configuration
@EnableConfigurationProperties(WeatherProperties.class)
@ConditionalOnClass(WeatherService.class)
@ConditionalOnProperty(prefix = "weather",value = "enable",matchIfMissing = false)
public class WeatherAutoConfiguration {

    @Autowired
    private WeatherProperties  weatherProperties;

    @Bean
    @ConditionalOnMissingBean(WeatherService.class)
    public WeatherService weatherService(){
        WeatherService weatherService = new WeatherServiceImpl(weatherProperties);
        return weatherService;
    }

}
