package com.checkin.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class HelloworldController {	
	
	@RequestMapping("/checkin/hello")
	public String helloWorld() {
		return "hello world -checkin ";
	}	
	
	

}
