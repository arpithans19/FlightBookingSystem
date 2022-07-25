package com.fare.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {	
	
	@RequestMapping("/hellworld")
	public String helloWorld() {
		return "hello world -fare";
	}	
	
	

}
