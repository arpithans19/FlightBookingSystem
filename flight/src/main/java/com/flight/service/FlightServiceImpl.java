package com.flight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.flight.entity.Flight;
import com.flight.exception.FlightNotFoundException;
import com.flight.model.Fare;
import com.flight.model.ResponseTemplate;
import com.flight.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService{
	
	@Autowired
	private FlightRepository flightRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Flight> getAllFlights() {
		
		List<Flight> allFlights = flightRepository.findAll();
		return allFlights;
	}
	
	@Override
	public ResponseTemplate getFlightByFare(int flightId) {
		ResponseTemplate response= new ResponseTemplate();
		Flight flight=flightRepository.findByFlightId(flightId);
		Fare fare=restTemplate.getForObject("http://localhost:8003/find/"+flight.getFareId(), Fare.class);
		if (flight.equals(null)) {
			throw new FlightNotFoundException("Flight Not found with id: " + flightId);
		}
		response.setFare(fare);
		response.setFlight(flight);
		return response;
	}
//	@Override
//	public Flight getFlightById(int flightId) {
//		Optional<Flight> optionalFlight= flightRepository.findById(flightId);
//		
//
//		if (optionalFlight.isEmpty()) {
//
//			throw new FlightNotFoundException("Flight Not found with id: " + flightId);
//		}
//
//		Flight flight= optionalFlight.get();
//		return flight;
//	}
	@Override
	public Flight saveFlight(Flight flight) {
		Flight newFlight =flightRepository.save(flight);
		return newFlight;
	}
	@Override
	public void deleteFlight(int flightId) {
		Optional<Flight> optionalFlight = flightRepository.findById(flightId);
		if (optionalFlight.isEmpty()) {
			throw new FlightNotFoundException("Flight Not existing with Id:" + flightId);

		}
		flightRepository.deleteById(flightId);
		
	}
	@Override
	public Flight updateFlight(Flight flight) {
		Optional<Flight> optionalFlight = flightRepository.findById(flight.getFlightId());
		if (optionalFlight.isEmpty()) {
			throw new FlightNotFoundException("User Not existing with Id:" + flight.getFlightId());

		}

		Flight updatedFlight = flightRepository.save(flight);

		return updatedFlight;
	}


	

}
