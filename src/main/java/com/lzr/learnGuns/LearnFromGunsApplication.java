package com.lzr.learnGuns;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableAutoConfiguration //自动加载配置信息
@SpringBootApplication
@EnableCaching//启用缓存
@MapperScan("com.lzr.learnGuns.dao.mapper")//也可以加到配置数据源的文件里
public class LearnFromGunsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnFromGunsApplication.class, args);
	}

}
