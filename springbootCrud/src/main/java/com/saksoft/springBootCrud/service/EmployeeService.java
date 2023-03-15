package com.saksoft.springBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saksoft.springBootCrud.bean.Employee;
import com.saksoft.springBootCrud.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	
	@Autowired
	public EmployeeRepository employeeRepo;
	public  List<Employee> getAllEmployee()
	{
		List<Employee> employees=new ArrayList<Employee>();
		 employeeRepo.findAll().forEach(employees::add);
		 return employees;	
	}
	
	
	public void addEmployee(Employee employee) {
		employeeRepo.save(employee);
	}


	public void updateEmployee(int id, Employee employee) {
		employeeRepo.save(employee);		
	}


	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);		
	}

}
