package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.Employee;
@Service
public interface ServiceI {
public int addEmployee(Employee emp);
	
	public List<Employee>getAllEmployee();
	
	public Employee Logincheck(Employee emp);
	
	public Employee edit(int empId);
	
	public Employee Delete(int empId);
	
	
}
