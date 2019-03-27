package com.allen.spring.src.learning.myweather;

import com.allen.spring.src.learning.weather.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


/**
 * @Author: allengent@163.com
 * @Date: 2019/3/26 18:14
 */


@Component
@Slf4j
public class GetWeatherRunner  implements ApplicationRunner{

    @Autowired
    private  WeatherService weatherService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String city="shenzheng";
        String weather=weatherService.getWeather(city);

        log.info("weather={}",weather);

    }
}
