package com.finzly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finzly.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
