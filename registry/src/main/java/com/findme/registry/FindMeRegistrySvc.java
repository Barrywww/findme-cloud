package com.findme.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class FindMeRegistrySvc {

	public static void main(String[] args) {
		SpringApplication.run(FindMeRegistrySvc.class, args);
	}
}
