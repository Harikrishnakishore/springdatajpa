package com.example.spring.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Employee {
	
	@Id
	@Column(name="emp_Id")
	private Long id;
	@Column(name="report_mgr")
	private Long reportMgr;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	private String email;
	private Long group_id;
	private Long desig_id;
	private double salary;
	
	
	
	
	public Long getGroup_id() {
		return group_id;
	}
	public void setGroup_id(Long group_id) {
		this.group_id = group_id;
	}
	public Long getDesig_id() {
		return desig_id;
	}
	public void setDesig_id(Long desig_id) {
		this.desig_id = desig_id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getReportMgr() {
		return reportMgr;
	}
	public void setReportMgr(Long reportMgr) {
		this.reportMgr = reportMgr;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
