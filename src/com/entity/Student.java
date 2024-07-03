package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sname;
	
	@ManyToOne
	@JoinColumn(name = "did")
	private Department department;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sid, String sname, Department department) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.department = department;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", department=" + department + "]";
	}
}
