package com.passenger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {	
	
	@RequestMapping("/passenger")
	public String helloWorld() {
		return "hello world -passenger ";
	}	
	

}
