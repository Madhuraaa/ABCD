package com.madhuri.Assn4;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Country {
private	String country;
private int zipcode;
private String state;
private String name;

public Country() {
	
}


public Country(String country, int zipcode, String state, String name) {
	super();
	this.country = country;
	this.zipcode = zipcode;
	this.state = state;
	this.name = name;
}

public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Country [country=" + country + ", zipcode=" + zipcode + ", state=" + state + ", name=" + name + "]";
}

}
