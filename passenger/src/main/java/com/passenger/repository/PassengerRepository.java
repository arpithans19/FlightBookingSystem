package com.passenger.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.passenger.entity.Passenger;

public interface PassengerRepository extends MongoRepository<Passenger, Integer>{

}
