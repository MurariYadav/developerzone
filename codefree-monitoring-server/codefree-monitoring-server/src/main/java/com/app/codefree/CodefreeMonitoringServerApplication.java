package com.app.codefree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
@EnableAdminServer
@SpringBootApplication
public class CodefreeMonitoringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodefreeMonitoringServerApplication.class, args);
	}

}
