package com.example.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Model.Employee;

@Repository
public interface EmployeeDaoI {

	public int addEmployee(Employee emp);
	
	public List<Employee>getAllEmployee();
	
	public Employee Logincheck(Employee emp);
	
	public Employee edit(Employee empId);
	
	public Employee Delete(int empId);
	
}
