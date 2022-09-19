package com.finzly.service;

import java.util.List;

import com.finzly.entity.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public Employee deleteEmployee(Integer employeeId);
	
	public List<Employee> getAllEmployees();

}
