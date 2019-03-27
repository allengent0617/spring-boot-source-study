package com.allen.spring.src.learning.applicationListener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: allengent@163.com
 * @Date: 2019/3/26 12:01
 */
@Component
@Slf4j
public class ApplicationListenerDemo implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        log.info("!!! ApplicationListener  onApplicationEvent  ! source={}  ",applicationEvent.getClass());

    }
}
