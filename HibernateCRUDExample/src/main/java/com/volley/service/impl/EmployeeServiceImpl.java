package com.volley.service.impl;

import com.volley.dao.impl.EmployeeDaoImpl;
import com.volley.entity.Employee;
import com.volley.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void CreateEmployee(Employee employee) {
		new EmployeeDaoImpl().addEmployee(employee);
		

	}

	@Override
	public Employee getEmplyeeById(int employeeId) {
		return new EmployeeDaoImpl().fetchEmplyeeById(employeeId);
	}

	@Override
	public void updateEmplyeeById(int employeeId, Double newSal) {
		new EmployeeDaoImpl().updateEmplyeeById(employeeId, newSal);
		

	}

	@Override
	public void deleteEmplyeeById(int employeeId) {
		new EmployeeDaoImpl().deleteEmplyeeById(employeeId);

	}

}
