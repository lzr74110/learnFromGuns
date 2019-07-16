package com.lzr.learnGuns;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration //自动加载配置信息
@SpringBootApplication
public class LearnFromGunsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnFromGunsApplication.class, args);
	}

}
