package com.allen.spring.src.learning.flyway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;


/**
 * @Author: allengent@163.com
 * @Date: 2019/3/26 14:24
 */

@SpringBootApplication
public class DemoApplication  {

	@Autowired
	DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
