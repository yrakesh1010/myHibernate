package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class StatesOfCountry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stateId;
	
	private String stateList;
	
	@ManyToOne
	private Country country;
	
	public StatesOfCountry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatesOfCountry(int stateId, String stateList, Country country) {
		super();
		this.stateId = stateId;
		this.stateList = stateList;
		this.country = country;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateList() {
		return stateList;
	}

	public void setStateList(String stateList) {
		this.stateList = stateList;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "StatesOfCountry [stateId=" + stateId + ", stateList=" + stateList + ", country=" + country + "]";
	}
	
	

}
