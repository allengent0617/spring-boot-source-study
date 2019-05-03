package com.api.demo;


import com.allen.selector.service.FileStore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author : allengent@163.com
 * @date : 2019/5/3 04:58
 * description :
 */
@Component
@Slf4j
public class MyCommandLineRunner  implements CommandLineRunner{


    @Autowired
    public FileStore fileStore;

    @Override
    public void run(String... args) throws Exception {

        log.info("run command line runner!");
        fileStore.storeFile(null,"");
    }
}
