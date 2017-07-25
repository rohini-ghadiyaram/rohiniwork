package com.spboot.rest.employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
private EmployeeRepo employeeRepo;
	private List<Employee> employees=new ArrayList<>(Arrays.asList(
			new Employee(1,"Rohini","Development", 10000),
			new Employee(1,"Santhosh","Testing", 10000),
			new Employee(1,"Sriram","Management", 10000))
			);
	public List<Employee> getAllEmployees(){
		List<Employee> employees=new ArrayList<>();
		employeeRepo.findAll().forEach(employees::add);	
	
		return employees;
	}
	public Employee getEmployee(int id){
	return employeeRepo.findOne(id);
		//return (Employee) employees.stream().filter(t->t.getId.equals(id).findFirst.get());
	}
	
	public void addEmployee(Employee employee){
		employeeRepo.save(employee);
	}
	public void updateEmployee(Employee employee,int id){
		employeeRepo.save(employee);
	}
	public void deleteEmployee(int id){
		employeeRepo.delete(id);
	}
	}
	

