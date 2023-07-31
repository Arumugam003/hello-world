package com.volley.client;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.volley.entity.Employee;
import com.volley.service.EmployeeService;
import com.volley.service.impl.EmployeeServiceImpl;
import com.volley.util.HibernateUtil;

public class ClientTest {

	public static void main(String[] args) {
		    
		    EmployeeService employeeservice = new EmployeeServiceImpl();
			//CreateEmployee(employeeservice);
			getEmplyeeById(employeeservice);
			//updateEmplyeeById(employeeservice);
			//deleteEmplyeeById(employeeservice);
			
			
	}
	
private static void CreateEmployee(EmployeeService employeeservice)
{
	employeeservice.CreateEmployee(getEmployee());
}


	private static void getEmplyeeById(EmployeeService employeeservice)
	{
		Employee employee=employeeservice.getEmplyeeById(1);
		System.out.println(employee);
	}
	
	
	private static void updateEmplyeeById(EmployeeService employeeservice)
	{
		employeeservice.updateEmplyeeById(1, 70000.00);
	}
	
	
	
	private static void deleteEmplyeeById(EmployeeService employeeservice)
	{
		employeeservice.deleteEmplyeeById(5);
	}
	
	
	

	
	
	private static Employee getEmployee() {
		Employee employee = new Employee();	
		employee.setName("Martin");
		employee.setEmail("Martin@gmail.com");
		employee.setDoj(new Date());
		employee.setSalary(20000.00);
		return employee;
		
	}

}
