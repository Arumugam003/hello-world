package com.volley.entity;

import java.util.Date;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="employee_table")
@DynamicUpdate   //It will used to update particular field like salary
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //Generated employee ID as auto generated
	private Integer employeeId;
	
	@Column(name="employee_name",nullable=false)
	private String name;
	
	@Column(name="email",unique = true)
	private String email;
	
	@Column(name="Date_Of_Joining")
	private Date doj;
	
	@Column(name="salary")
	private Double salary;
	
	public Integer getId() {
		return employeeId;
	}
	public void setId(Integer id) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + employeeId + ", name=" + name + ", email=" + email + ", doj=" + doj + ", salary=" + salary
				+ "]";
	}
	
	

}
