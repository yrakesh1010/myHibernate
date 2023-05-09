package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int projectId;
	
  private String pName;
	
    @ManyToMany(mappedBy = "pList")
	private List<Employee> eList;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, String pName, List<Employee> eList) {
		super();
		this.projectId = projectId;
		this.pName = pName;
		this.eList = eList;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public List<Employee> geteList() {
		return eList;
	}

	public void seteList(List<Employee> eList) {
		this.eList = eList;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", pName=" + pName + ", eList=" + eList + "]";
	}

	
	
	
}
