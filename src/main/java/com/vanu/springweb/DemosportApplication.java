package com.vanu.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemosportApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemosportApplication.class, args);
	}

}
