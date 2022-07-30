package com.fare.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fare")
public class Fare {

	@Id
	private int fareId;
	private double economyFare;
	private double premiumFare;
	private double businessFare;
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
