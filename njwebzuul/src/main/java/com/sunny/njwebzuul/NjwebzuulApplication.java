package com.sunny.njwebzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy//网关代理
public class NjwebzuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(NjwebzuulApplication.class, args);
	}

}
