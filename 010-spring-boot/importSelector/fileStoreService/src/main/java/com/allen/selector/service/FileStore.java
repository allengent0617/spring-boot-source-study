package com.allen.selector.service;

import java.io.InputStream;

/**
 * @author : allengent@163.com
 * @date : 2019/5/3 04:47
 * description :
 */
public interface FileStore {
    boolean storeFile(InputStream  inputStream, String FileName);
}
