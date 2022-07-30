package com.passenger.service;


import com.passenger.entity.Passenger;


public interface PassengerService {

	public Passenger savePassenger(Passenger passenger);
	public Passenger getPassenger(int passengerId);
	public Passenger modifyPassenger(Passenger passenger);
	public void deletePassenger(int passengerId);
}
