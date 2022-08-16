package com.example.Dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDaoI{
@Autowired	
private SessionFactory sf;




	@Override
	public int addEmployee(Employee emp) {
	Session session = sf.openSession();
session.beginTransaction();
int id =(int) session.save(emp);
session.getTransaction().commit();
		return id;
	}

	@Override
	public List<Employee> getAllEmployee() {
	Session session = sf.openSession();
	session.beginTransaction();
	String hql="from Employee";
	Query query = session.createQuery(hql);
	List list = query.getResultList();
	
		return list;
	}

	@Override
	public Employee Logincheck(Employee emp) {
		Session session = sf.openSession();
		String hql="from Employee";
		Query query = session.createQuery(hql);
		List <Employee>list = query.getResultList();
		for (Employee emp1:list) {
			if(emp.getEmpName().equals(emp1.getEmpName())&&(emp.getEmpAddress().equals(emp1.getEmpAddress()))) {
				
				return emp1;
			}
			
		}
		return null;
	}

	@Override
	public Employee edit(int empId) {
		Session session = sf.openSession();
		Employee employee = session.get(Employee.class,empId);
		return employee;
	}

	@Override
	public Employee Delete(int empId) {
		Session session = sf.openSession();
		session.beginTransaction();
		Employee employee = session.get(Employee.class, empId);
		if (employee !=null) {
			session.delete(employee);
			session.getTransaction();
			session.close();
		}
			return employee;
		}
		
	}
	
	
	


