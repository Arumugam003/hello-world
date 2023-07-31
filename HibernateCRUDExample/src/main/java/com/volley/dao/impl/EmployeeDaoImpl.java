package com.volley.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.volley.dao.EmployeeDao;
import com.volley.entity.Employee;
import com.volley.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void addEmployee(Employee employee) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();

			Integer id = (Integer) session.save(employee); // return generated primary key
			System.out.println("Employee ID for primary key created : " + id);

			session.getTransaction().commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Employee fetchEmplyeeById(int employeeId) {
		Employee employee=null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			employee= session.get(Employee.class, employeeId);
			if(employee!=null)
				System.out.println(employee);
			else
				System.out.println("Employee doesn't exist");

		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public void updateEmplyeeById(int employeeId, Double newSal) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Employee employee=session.get(Employee.class, employeeId);
			if(employee!=null)
			{
				employee.setSalary(newSal);
				session.beginTransaction();
				session.update(employee);
				session.getTransaction().commit();
			}
			else
				System.out.println("Employee doesn't exist");
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmplyeeById(int employeeId) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Employee employee=session.get(Employee.class, employeeId);
			if(employee!=null)
			{
				session.beginTransaction();
				session.delete(employee);
				session.getTransaction().commit();
			}
			else
				System.out.println("Employee doesn't exist");
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

}
