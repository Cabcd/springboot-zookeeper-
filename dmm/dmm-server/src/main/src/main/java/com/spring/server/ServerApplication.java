package com.spring.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@CrossOrigin//允许跨越访问
@SpringBootApplication
@EnableDubboConfiguration
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}