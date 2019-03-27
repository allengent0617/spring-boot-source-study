package com.allen.spring.src.learning.weather;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: allengent@163.com
 * @Date: 2019/3/26 18:04
 */

@ConfigurationProperties(prefix = "spring.weather")
public class WeatherProperties {
    private  String url;
    private String day;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
