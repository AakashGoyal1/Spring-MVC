package com.employee.services;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.dao.EmployeeDao;
import com.employee.Models.Employee;


public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	public void add(Employee employee) {
		employeeDao.addEmployeeData(employee);
	}

	public ArrayList<Employee> getEmployeesList() {
		return employeeDao.getEmployeesList();
	}

	public void deleteEmployeeRecord(String userName) {
		employeeDao.deleteEmployeeRecord(userName);
	}

	public void updateEmployeeRecord(Employee employee) {
		employeeDao.updateEmployeeRecord(employee);
	}

	public Employee getEmployeeRecord(String userName) {
		return employeeDao.getEmployeeRecord(userName);
	}



}
