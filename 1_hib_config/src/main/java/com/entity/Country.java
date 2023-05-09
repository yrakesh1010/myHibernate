package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Country {
 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int countryId;
  
  private String countryName;
  
  @OneToMany(mappedBy = "country")
  private List<StatesOfCountry> states;

  public Country() {
	super();
	// TODO Auto-generated constructor stub
}
public Country(int countryId, String countryName, List<StatesOfCountry> states) {
	super();
	this.countryId = countryId;
	this.countryName = countryName;
	this.states = states;
}
public int getCountryId() {
	return countryId;
}
public void setCountryId(int countryId) {
	this.countryId = countryId;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public List<StatesOfCountry> getStates() {
	return states;
}
public void setStates(List<StatesOfCountry> states) {
	this.states = states;
}
@Override
public String toString() {
	return "Country [countryId=" + countryId + ", countryName=" + countryName + ", states=" + states + "]";
}
  
  
}
