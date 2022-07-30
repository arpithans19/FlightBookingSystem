package com.flight.controller;

import java.util.List;

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

import com.flight.entity.Flight;
import com.flight.model.ResponseTemplate;
import com.flight.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired 
	private FlightService flightService;

	@GetMapping("/getallflights")

		public List<Flight> fetchAllFlights() {
			List<Flight> flightList = flightService.getAllFlights();
			return flightList;

		}
	
	@GetMapping("/flight/{fId}")
	public ResponseTemplate getFlightWithFare(@PathVariable("fId") int flightId) {
		
		return flightService.getFlightByFare(flightId);
		
	}
	    
//	    @GetMapping("/flight/get/{fId}")
//		public ResponseEntity<Object> fetchFlightById(@PathVariable("fId") int flightId) {
//			
//			ResponseEntity<Object> responseEntity = null;		
//			Flight flight = flightService.getFlightById(flightId);	
//			responseEntity = new ResponseEntity<>(flight,HttpStatus.OK);				
//			return responseEntity;
//		}
	    
	    @PostMapping("/flight/addFlight")
		public ResponseEntity<Flight> addFlight( @RequestBody Flight flight) {
	    	Flight newFlight = flightService.saveFlight(flight);
			ResponseEntity<Flight> responseEntity = new ResponseEntity<>(newFlight, HttpStatus.OK);
			return responseEntity;

		}
	    @DeleteMapping("/flight/delete/{flightId}")
		public ResponseEntity<String> removeUser(@PathVariable("flightId") int flightId) {
	    	flightService.deleteFlight(flightId);
			ResponseEntity<String> responseEntity = new ResponseEntity<>("User deleted successfully!!", HttpStatus.OK);
			return responseEntity;
		}

		@PutMapping("/user/update")
		public ResponseEntity<Flight> modifyUser(@RequestBody Flight flight) {
			Flight updateUser = flightService.updateFlight(flight);
			ResponseEntity<Flight> responseEntity = new ResponseEntity<>(updateUser, HttpStatus.OK);
			return responseEntity;
		}

}
