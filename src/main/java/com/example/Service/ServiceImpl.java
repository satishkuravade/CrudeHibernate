package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.EmployeeDaoI;
import com.example.Model.Employee;

@Service
public class ServiceImpl implements ServiceI{
	
	
@Autowired
	private EmployeeDaoI employeeDaoI;
	
	@Override
	public int addEmployee(Employee emp) {
		int id = employeeDaoI.addEmployee(emp);
		return id;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list = employeeDaoI.getAllEmployee();
		return   list;
	}

	@Override
	public Employee Logincheck(Employee emp) {
		Employee employee1 = employeeDaoI.Logincheck(emp);
		return employee1;
	}

	@Override
	public Employee edit(int empId) {
		 Employee employee = employeeDaoI.edit(empId);
		return employee;
	}

	@Override
	public Employee Delete(int empId) {
		Employee employee = employeeDaoI.Delete(empId);
		return  employee;
	}

	
}
