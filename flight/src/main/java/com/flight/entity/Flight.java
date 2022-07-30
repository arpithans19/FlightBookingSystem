package com.flight.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "flight")
public class Flight {

	@Id
	private int flightId;
	private String fromLocation;
	private String destination;
	private String date;
	private String flightStatus;
	private String seatNo;
	private String flightType;
	private int fareId;
	
	
	
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int flightId, String fromLocation, String destination, String date, String flightStatus,
			String seatNo, String flightType, int fareId) {
		super();
		this.flightId = flightId;
		this.fromLocation = fromLocation;
		this.destination = destination;
		this.date = date;
		this.flightStatus = flightStatus;
		this.seatNo = seatNo;
		this.flightType = flightType;
		this.fareId = fareId;
	}
	public int getFareId() {
		return fareId;
	}
	public void setFareId(int fareId) {
		this.fareId = fareId;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFlightStatus() {
		return flightStatus;
	}
	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
}
