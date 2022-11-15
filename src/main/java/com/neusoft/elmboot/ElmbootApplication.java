package com.neusoft.elmboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.neusoft.elmboot.mapper")
@SpringBootApplication
public class ElmbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElmbootApplication.class, args);
	}

}
