package com.allen.selector.config;

import com.allen.selector.service.AliyunFileStoreImpl;
import com.allen.selector.service.FileStore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : allengent@163.com
 * @date : 2019/5/3 04:42
 * description :
 */

@Configuration
@Slf4j
public class AliyunFileConfig {

    @Bean
    public FileStore aliyunFileStore() {
        FileStore fileStore = new AliyunFileStoreImpl();
        log.info("in AliyunFileConfig  :   aliyunFileStore");
        return fileStore;
    }
}