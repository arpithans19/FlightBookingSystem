package com.passenger.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.passenger.entity.Passenger;
import com.passenger.repository.PassengerRepository;
@Service
public class PassengerServiceImpl implements PassengerService{

	@Autowired
	private PassengerRepository passengerRepository;
	
	@Override
	public Passenger savePassenger(Passenger passenger) {
		Passenger newPassenger= passengerRepository.save(passenger);
		return newPassenger;
	}

	@Override
	public Passenger getPassenger(int passengerId) {
		Optional<Passenger> optionalPassenger= passengerRepository.findById(passengerId);
		Passenger passenger=optionalPassenger.get();
		return passenger;
	}

	@Override
	public void deletePassenger(int passengerId) {
		Optional<Passenger> optionalPassenger=passengerRepository.findById(passengerId);
		passengerRepository.deleteById(passengerId);		
	}

	@Override
	public Passenger modifyPassenger(Passenger passenger) {
		Optional<Passenger> optionalPassenger= passengerRepository.findById(passenger.getPassengerId());
		Passenger modifiedPassenger=passengerRepository.save(passenger);
		return modifiedPassenger;
	}

}
