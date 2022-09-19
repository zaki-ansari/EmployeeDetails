package com.finzly.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.entity.Employee;
import com.finzly.exception.ResourceNotFoundException;
import com.finzly.repository.EmployeeRepo;
import com.finzly.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepo employeeRepo;
	

	@Override
	public Employee saveEmployee(Employee employee) {
		
		Employee savedEmployee = this.employeeRepo.save(employee);
		return savedEmployee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee existedEmployee = this.employeeRepo.findById(employee.getId()).orElseThrow(()-> new ResourceNotFoundException("Employee not found with this id :"+employee.getId()));
		
		Employee savedEmployee = this.employeeRepo.save(employee);
		
		return savedEmployee;
	}

	@Override
	public Employee deleteEmployee(Integer employeeId) {
		Employee deletedEmployee = this.employeeRepo.findById(employeeId).orElseThrow(()-> new ResourceNotFoundException("Employee not found with this id :"+employeeId));
		return deletedEmployee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> employees = this.employeeRepo.findAll();
		return employees;
	}

}
