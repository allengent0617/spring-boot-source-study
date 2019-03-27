package com.allen.spring.src.learning.springApplicationRunListener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;


/**
 * @Author: allengent@163.com
 * @Date: 2019/3/26 16:01
 */
@Slf4j
public class SpringApplicationRunListenerDemo implements SpringApplicationRunListener {

    /*
    必须要 有这个构造函数
    因为 在createSpringFactoriesInstances 方法里面 获取了下面的构造器
             Constructor<?> constructor = instanceClass.getDeclaredConstructor(parameterTypes);
     */
    public SpringApplicationRunListenerDemo(SpringApplication application, String[] args) {
    }


    @Override
    public void starting() {
        log.info("!!!!!! SpringApplicationRunListener starting..");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        log.info("!!!!!! SpringApplicationRunListener environmentPrepared..");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        log.info("!!!!!! SpringApplicationRunListener contextPrepared..");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        log.info("!!!!!! SpringApplicationRunListener contextLoaded..");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        log.info("!!!!!! SpringApplicationRunListener started..");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        log.info("!!!!!!  SpringApplicationRunListener running..");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        log.info("!!!!!! SpringApplicationRunListener failed..");
    }
}
