package com.app.mk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages = "com.app.mk")
@EntityScan(basePackages = "com.app.mk")
@ComponentScan(basePackages="com.app.mk")
@EnableDiscoveryClient
@EnableAutoConfiguration
@SpringBootApplication
public class OrderAppServerApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(OrderAppServerApplication.class, args);
		 
	}
}
