package com.allen.spring.src.learning.myweather;


import com.allen.spring.src.learning.weather.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: allengent@163.com
 * @Date: 2019/3/26 18:14
 */
@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @RequestMapping("/get")
    public String getWeather(@RequestParam("city") String city)
    {

        return weatherService.getWeather(city);
    }
}
