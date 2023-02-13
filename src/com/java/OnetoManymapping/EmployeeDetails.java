package com.java.OnetoManymapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="EmployeeDetails")
public class EmployeeDetails {
	
	@Id @GeneratedValue
	private int id;
	
	private String name;
	
	@OneToMany
	@JoinTable(name="user",joinColumns=@JoinColumn(name="User_id"),
	inverseJoinColumns=@JoinColumn(name="certif_id"))
	private List<Certification> certificate = new ArrayList<Certification>();

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

	public List<Certification> getCertificate() {
		return certificate;
	}

	public void setCertificate(List<Certification> certificate) {
		this.certificate = certificate;
	}
	
	
	
	
	
	

}
