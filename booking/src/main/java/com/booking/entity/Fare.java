package com.booking.entity;

public class Fare {

	private int fareId;
	private double economyFare;
	private double premiumFare;
	private double businessFare;
	private Flight flight;
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public int getFareId() {
		return fareId;
	}
	public void setFareId(int fareId) {
		this.fareId = fareId;
	}
	public double getEconomyFare() {
		return economyFare;
	}
	public void setEconomyFare(double economyFare) {
		this.economyFare = economyFare;
	}
	public double getPremiumFare() {
		return premiumFare;
	}
	public void setPremiumFare(double premiumFare) {
		this.premiumFare = premiumFare;
	}
	public double getBusinessFare() {
		return businessFare;
	}
	public void setBusinessFare(double businessFare) {
		this.businessFare = businessFare;
	}
	
	
}
