package com.flight.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {	
	
	@RequestMapping("/flight")
	public String helloWorld() {
		return "hello world -flight";
	}	
	
	

}
