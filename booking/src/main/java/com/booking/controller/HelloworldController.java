package com.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.stream.*;

import com.booking.model.Booking;
import com.booking.model.HelloWorld1;

@RestController
public class HelloworldController {	
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@RequestMapping("/hellworld/{hell}")
	public Booking getHelloWorld(@PathVariable("hell") String str1) {
		
		HelloWorld1 helloWorld1= restTemplate.getForObject("http://localhost:8001/hellworld"+ str1, HelloWorld1.class);
		helloWorld1.setStr1("Hello Booking");
		return new Booking(helloWorld1.getStr1()
				);
			
//			HelloWorld2 helloWorld2= restTemplate.getForObject("http://localhost:8000/hellworld"+ a.str2, HelloWorld2.class);
//			return new Booking(helloWorld2.)
//			
//			
//		}
//				);
		
		
	}	
	
	

}