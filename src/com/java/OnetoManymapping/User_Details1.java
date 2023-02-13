package com.java.OnetoManymapping;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="User_details1")
public class User_Details1 {
	
	@Id @GeneratedValue
	private int id;
	private String name;
	

	@OneToMany
	private Collection<Vehicles1> vehicleName = new ArrayList<Vehicles1>();
	
	public Collection<Vehicles1> getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(Collection<Vehicles1> vehicleName) {
		this.vehicleName = vehicleName;
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
	
	
	

}
