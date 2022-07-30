package com.booking.entity;

import javax.persistence.OneToMany;

public class Flight {

	private int flightId;
	private String flightName;
	private String depatureLocation;
	private String arrivalLocation;
	@OneToMany
	private Fare fare;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getDepatureLocation() {
		return depatureLocation;
	}
	public void setDepatureLocation(String depatureLocation) {
		this.depatureLocation = depatureLocation;
	}
	public String getArrivalLocation() {
		return arrivalLocation;
	}
	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}
	public Fare getFare() {
		return fare;
	}
	public void setFare(Fare fare) {
		this.fare = fare;
	}
	
	
}
