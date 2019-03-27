package com.allen.spring.src.learning.commandLineRunner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * @Author: allengent@163.com
 * @Date: 2019/3/26 14:04
 */

@Component
@Slf4j
@Order(value = 2)
public class CommandLineRunnerDemo1 implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        log.info("exec  CommandLineRunner demo1  runnning ..");
    }
}
