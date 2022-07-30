package com.fare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fare.entity.Fare;
import com.fare.service.FareService;

@RestController
public class FareController {
	
	@Autowired
	private FareService fareService;
	
	@PostMapping("/save")
	public ResponseEntity<Fare> addFare(@RequestBody Fare fare) {
		Fare newFare = fareService.saveFare(fare);
		ResponseEntity<Fare> responseEntity = new ResponseEntity<>(newFare, HttpStatus.OK);
		return responseEntity;

	}
	
	@GetMapping("/find/{fId}")
	public ResponseEntity<Object> getFare(@PathVariable("fId") int fareId) {
		ResponseEntity<Object> responseEntity = null;
		Fare fare = fareService.getFare(fareId);
		responseEntity = new ResponseEntity<Object>(fare, HttpStatus.OK);
		return responseEntity;
	}
	
	@PutMapping("/modify")
	public ResponseEntity<Fare> modifyFare(@RequestBody Fare fare) {
		Fare modifiedFare=fareService.modifyFare(fare);
		ResponseEntity<Fare> responseEntity = new ResponseEntity<>(modifiedFare, HttpStatus.OK);
		return responseEntity;
	}
	
	@DeleteMapping("delete/{fId}")
	public ResponseEntity<String> removeFare(@PathVariable("fId") int fareId) {

		fareService.deleteFare(fareId);
		return new ResponseEntity<>("Fare removed Successfully.", HttpStatus.OK);
	}


}
