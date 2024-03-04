package com.findme.locationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@SpringBootApplication
public class FindMeLocationService {

    public static void main(String[] args) {
        SpringApplication.run(FindMeLocationService.class, args);
    }
}
