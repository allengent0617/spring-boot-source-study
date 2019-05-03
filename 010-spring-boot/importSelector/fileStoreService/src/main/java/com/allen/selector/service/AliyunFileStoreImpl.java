package com.allen.selector.service;


import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;

/**
 * @author : allengent@163.com
 * @date : 2019/5/3 04:48
 * description :
 */
@Slf4j
public class AliyunFileStoreImpl implements FileStore {
    @Override
    public boolean storeFile(InputStream inputStream, String FileName) {
        log.info("exec  aliyun file Store !");
        return false;
    }
}
