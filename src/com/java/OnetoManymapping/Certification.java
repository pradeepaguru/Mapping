package com.java.OnetoManymapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Certification")
public class Certification {
	
	@Id @GeneratedValue
	private int certId;
	private String certName;
	

	@ManyToOne
	@JoinColumn(name="Emp_id")
	private EmployeeDetails emp;
	
	public EmployeeDetails getEmp() {
		return emp;
	}
	public void setEmp(EmployeeDetails emp) {
		this.emp = emp;
	}
	
	public int getCertId() {
		return certId;
	}
	public void setCertId(int certId) {
		this.certId = certId;
	}
	public String getCertName() {
		return certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}
	
	
	

}
