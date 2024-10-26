package com.demo;

import javax.persistence.Embeddable;

@Embeddable
public class Address 
{
  private String street;
  private String city;
  private int pincode;
  private String state;
  
public Address()
{
	super();
	
}
public Address(String street, String city, int pincode, String state) 
{
	super();
	this.street = street;
	this.city = city;
	this.pincode = pincode;
	this.state = state;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

  
  
}
