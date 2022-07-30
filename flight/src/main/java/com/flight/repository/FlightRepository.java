package com.flight.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.flight.entity.Flight;

public interface FlightRepository extends MongoRepository<Flight, Integer>{

	public Flight findByFlightId(int flightId);
}
