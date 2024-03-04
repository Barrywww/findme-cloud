package com.findme.locationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaseController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public String testApi() {
        return "Hello FindMe";
    }

    @GetMapping("/service-instances/{appName}")
    public List<ServiceInstance> getServiceInstanceByAppName(@PathVariable String appName) {
        return this.discoveryClient.getInstances(appName);
    }
}
