package com.passenger.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "passenger")
public class Passenger {
	
	@Id
	private int passengerId;
	private String name;
	private int age;
	private long phone;
	private String email;
	private String address;
	
	
	
	public int getPassengerId() {
		return passengerId;
	}



	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public long getPhone() {
		return phone;
	}



	public void setPhone(long phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", name=" + name + ", age=" + age + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + "]";
	}
	
	

}
