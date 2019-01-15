package com.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrestapi.model.Employee;
import com.springbootrestapi.repository.EmployeeRepository;

@Service
public class EmployeeDAO {

	@Autowired
	EmployeeRepository employeeRepository;
	
	/* TASK WE NEED TO PERFORM IN THIS DAO
	 * 1. To save an employee
	 * 2. Search all employees
	 * 3. Update an employee/ Get an employee
	 * 4. Delete an employee
	 */
	
	//To save an employee
	public Employee save(Employee emp)
	{
		return employeeRepository.save(emp); 
	}
	
	//Search all employees
	public List<Employee> findAll()
	{
		return employeeRepository.findAll();
	}
	
	//Get an employee
	public Employee findOne(Long empid)
	{
		return employeeRepository.findOne(empid);
	}
	
	//Delete an employee
	public void delete(Employee emp)
	{
		employeeRepository.delete(emp);
	}
}
