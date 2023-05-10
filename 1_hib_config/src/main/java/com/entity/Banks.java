package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Banks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bankId;
	@Column(name = "bank_name")
    private String bankName;
	@OneToMany(mappedBy = "bank",cascade = CascadeType.ALL)
    private List<BankBranch> branch;
	public Banks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Banks(int bankId, String bankName, List<BankBranch> branch) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.branch = branch;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public List<BankBranch> getBranch() {
		return branch;
	}
	public void setBranch(List<BankBranch> branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Banks [bankId=" + bankId + ", bankName=" + bankName + ", branch=" + branch + "]";
	}
	
	
}
