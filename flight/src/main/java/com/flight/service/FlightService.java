package com.flight.service;

import java.util.List;

import com.flight.entity.Flight;
import com.flight.model.ResponseTemplate;

public interface FlightService {
	
	public List<Flight> getAllFlights();

//	public Flight getFlightById(int flightId);
	
	public ResponseTemplate getFlightByFare(int flightId);
	
	public Flight saveFlight(Flight flight);
	
	public void deleteFlight(int flightId);
	
	public Flight updateFlight(Flight flight);

}
