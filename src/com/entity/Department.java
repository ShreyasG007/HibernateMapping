package com.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Department(int did, String dname, Set<Student> student) {
		super();
		this.did = did;
		this.dname = dname;
		this.student = student;
	}


	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	private String dname;
	
	@OneToMany(mappedBy = "department")
	private Set<Student> student;
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", student=" + student + "]";
	}
	
	
}
