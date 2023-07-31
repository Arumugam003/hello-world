package com.volley.dao;

import com.volley.entity.Employee;

public interface EmployeeDao 
{
	public abstract void addEmployee(Employee employee);
	public abstract Employee fetchEmplyeeById(int employeeId);
	public abstract void updateEmplyeeById(int employeeId,Double newSal);
	public abstract void deleteEmplyeeById(int employeeId);

}
