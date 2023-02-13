package com.java.PracticeMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="School")
public class School {

	@Id @GeneratedValue
	private int class_id;
	private String teacherName;
	
	@OneToMany
	@JoinTable(name="School_Details",joinColumns=@JoinColumn(name="class_id"),
	inverseJoinColumns=@JoinColumn(name="student_id"))
	private List<Students> students = new ArrayList<Students>();

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}
	
	
}
