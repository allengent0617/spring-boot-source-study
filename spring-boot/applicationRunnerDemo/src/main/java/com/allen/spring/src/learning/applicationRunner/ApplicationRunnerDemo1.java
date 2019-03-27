package com.allen.spring.src.learning.applicationRunner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * @Author: allengent@163.com
 * @Date: 2019/3/26 14:01
 */

@Component
@Slf4j
@Order(value = 1)
public class ApplicationRunnerDemo1 implements ApplicationRunner{
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("exec  ApplicationRunner demo1  runnning ..");
    }
}
