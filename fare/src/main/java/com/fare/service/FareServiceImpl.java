package com.fare.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fare.entity.Fare;
import com.fare.repository.FareRepository;

@Service
public class FareServiceImpl implements FareService{

	@Autowired
	private FareRepository fareRepository;
	
	@Override
	public Fare saveFare(Fare fare) {
		Fare newFare=fareRepository.save(fare);
		return newFare;
	}

	@Override
	public Fare getFare(int fareId) {
		Optional<Fare> optionalFetchById=fareRepository.findById(fareId);
		Fare fare=optionalFetchById.get();
		return fare;
	}

	@Override
	public Fare modifyFare(Fare fare) {
		Optional<Fare> optionalModifyById=fareRepository.findById(fare.getFareId());
		Fare modifiedFare=fareRepository.save(fare);
		return modifiedFare;
	}

	@Override
	public void deleteFare(int fareId) {
		Optional<Fare> optionalFare=fareRepository.findById(fareId);
		fareRepository.deleteById(fareId);		
		
	}

}
