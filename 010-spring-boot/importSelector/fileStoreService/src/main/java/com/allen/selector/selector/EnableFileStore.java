package com.allen.selector.selector;

/**
 * @author : allengent@163.com
 * @date : 2019/5/3 04:27
 * description :
 */

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import(FileStoreSelector.class)
public @interface EnableFileStore {
}