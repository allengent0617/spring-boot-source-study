package com.allen.spring.src.learning.weather;



/**
 * @Author: allengent@163.com
 * @Date: 2019/3/26 18:04
 */

public class WeatherServiceImpl implements WeatherService {

    private WeatherProperties  weatherProperties;

    public WeatherServiceImpl(WeatherProperties weatherProperties) {
        this.weatherProperties=weatherProperties;
    }



    public String getWeather(String city) {
        String url=weatherProperties.getUrl();
        String day=weatherProperties.getDay();
        return request(url,day,city);
    }

    public String  request(String url,String day,String city)
    {
        return  new StringBuilder(city).append(" cloudy ,23-27 ℃  " ).append(day).toString();
    }

}
