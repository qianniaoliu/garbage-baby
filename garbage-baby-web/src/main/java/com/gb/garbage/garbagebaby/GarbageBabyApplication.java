package com.gb.garbage.garbagebaby;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.gb.garbage")
@EnableDubbo(scanBasePackages = {"com.gb.garbage.garbagebaby.service"})
@MapperScan(basePackages = {"com.gb.garbage.mapper"})
public class GarbageBabyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarbageBabyApplication.class, args);
	}

}
