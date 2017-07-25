package com.spboot.rest.employees;

import org.springframework.data.repository.CrudRepository;

import com.spboot.rest.employees.Employee;


public interface EmployeeRepo extends CrudRepository<Employee,Integer>{

}
