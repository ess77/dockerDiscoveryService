package com.ess.docker_kubernetes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryServiceController {
	
	@GetMapping("/discoveryService")
	public String sayHello() {
		return "Docker Discovery Service is up.";
	}

}
