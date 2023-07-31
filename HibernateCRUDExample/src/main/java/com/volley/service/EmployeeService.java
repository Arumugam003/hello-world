package com.volley.service;


import com.volley.entity.Employee;

public interface EmployeeService 
{
	public abstract void CreateEmployee(Employee employee);
	public abstract Employee getEmplyeeById(int employeeId);
	public abstract void updateEmplyeeById(int employeeId,Double newSal);
	public abstract void deleteEmplyeeById(int employeeId);
	

}
