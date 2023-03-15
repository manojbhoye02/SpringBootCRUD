package com.saksoft.springBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saksoft.springBootCrud.bean.Employee;
import com.saksoft.springBootCrud.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/employees")
	public void addEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/employees/{id}")
	public void updateEmployee(@PathVariable int id,@RequestBody Employee employee)
	{
		employeeService.updateEmployee(id,employee);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/employees/{id}")
	public void DeleteEmployee(@PathVariable int id)
	{
		employeeService.deleteEmployee(id);
		
	}
	
	
}
