package com.saksoft.springBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.saksoft.springBootCrud.bean.Employee;

public interface EmployeeRepository extends  CrudRepository<Employee, Integer>{

}
