package com.passenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.passenger.entity.Passenger;
import com.passenger.service.PassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

	@Autowired
	private PassengerService passengerService;

	@PostMapping("/save")
	public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger) {
		Passenger newPassenger = passengerService.savePassenger(passenger);
		ResponseEntity<Passenger> responseEntity = new ResponseEntity<>(newPassenger, HttpStatus.OK);
		return responseEntity;

	}
	
	@GetMapping("/find/{pId}")
	public ResponseEntity<Object> getPassenger(@PathVariable("pId") int passengerId) {
		ResponseEntity<Object> responseEntity = null;
		Passenger passenger = passengerService.getPassenger(passengerId);
		responseEntity = new ResponseEntity<Object>(passenger, HttpStatus.OK);
		return responseEntity;
	}
	
	@PutMapping("/modify")
	public ResponseEntity<Passenger> modifyPassenger(@RequestBody Passenger passenger) {
		Passenger modifiedassenger=passengerService.modifyPassenger(passenger);
		ResponseEntity<Passenger> responseEntity = new ResponseEntity<>(modifiedassenger, HttpStatus.OK);
		return responseEntity;
	}
	
	@DeleteMapping("delete/{pId}")
	public ResponseEntity<String> removePassenger(@PathVariable("pId") int passengerId) {

		passengerService.deletePassenger(passengerId);
		return new ResponseEntity<>("Passenger Deleted Successfully.", HttpStatus.OK);
	}

}
