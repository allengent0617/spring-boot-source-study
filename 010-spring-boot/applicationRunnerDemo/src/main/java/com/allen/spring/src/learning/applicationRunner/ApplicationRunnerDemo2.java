package com.allen.spring.src.learning.applicationRunner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * @Author: allengent@163.com
 * @Date: 2019/3/26 12:01
 */

@Component
@Slf4j
@Order(value = 2)
public class ApplicationRunnerDemo2 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("exec  ApplicationRunner demo2  runnning ..");
    }
}
