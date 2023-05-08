package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
   private int id;
   private String name;
   private String city;
   private Certificate cer;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, String city, Certificate cer) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.cer = cer;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Certificate getCer() {
	return cer;
}
public void setCer(Certificate cer) {
	this.cer = cer;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + ", cer=" + cer + "]";
}

 
   
}
