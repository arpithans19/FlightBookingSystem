package com.fare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fare.entity.Fare;

public interface FareRepository extends MongoRepository<Fare, Integer>{

}
