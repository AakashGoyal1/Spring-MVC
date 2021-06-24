package com.employee.services;


import java.util.ArrayList;

import com.employee.Models.Employee;


public interface EmployeeService {

	
    public void add(Employee employee);
	
	public ArrayList<Employee> getEmployeesList();
	
	public void deleteEmployeeRecord(String userName);
	
	public void updateEmployeeRecord(Employee employee);

	public Employee getEmployeeRecord(String userName);
}
