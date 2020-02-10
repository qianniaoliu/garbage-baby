package com.gb.garbage.garbagebaby;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = {"com.gb.garbage.garbagebaby.service"})
public class GarbageBabyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarbageBabyApplication.class, args);
	}

}
