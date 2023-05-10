package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BankBranch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int branchId;
	@Column(name="bank_branch")
  private String branch;
	@ManyToOne(cascade = CascadeType.ALL)
  private Banks bank;
	public BankBranch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankBranch(int branchId, String branch, Banks bank) {
		super();
		this.branchId = branchId;
		this.branch = branch;
		this.bank = bank;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Banks getBank() {
		return bank;
	}
	public void setBank(Banks bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "BankBranch [branchId=" + branchId + ", branch=" + branch + ", bank=" + bank + "]";
	}
	
	
}
