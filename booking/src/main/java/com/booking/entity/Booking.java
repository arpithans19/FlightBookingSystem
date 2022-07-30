package com.booking.entity;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Booking {
	private int bookingId;
	@ManyToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	

}
