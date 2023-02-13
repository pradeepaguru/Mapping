package com.java.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Items {
	@Id @GeneratedValue
	private int id;
	private String name;
	
	@ManyToMany
	private List<Categories> cat = new ArrayList<Categories>();

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

	public List<Categories> getCat() {
		return cat;
	}

	
	

}
