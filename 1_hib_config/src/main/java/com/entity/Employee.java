package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int empid;

private String eName;

@ManyToMany(fetch = FetchType.EAGER)
private List<Project> pList;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int empid, String eName, List<Project> pList) {
	super();
	this.empid = empid;
	this.eName = eName;
	this.pList = pList;
}

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String geteName() {
	return eName;
}

public void seteName(String eName) {
	this.eName = eName;
}

public void setpList(List<Project> pList) {
	this.pList=pList;
}

public List<Project> getPList(){
	return pList;
}

@Override
public String toString() {
	return "Employee [empid=" + empid + ", eName=" + eName + ", pList=" + pList + "]";
}


}



