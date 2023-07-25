package com.hibernate.many_to_one_mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.many_to_one_mapping.entity.Employee;
import com.hibernate.many_to_one_mapping.service.EmployeeService;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public void createQuestion(@RequestBody Employee employee)
	{
		employeeService.save(employee);
	}
	
	@GetMapping
	public List<Employee> getAllUser()
	{
		return employeeService.getAll();
	}
	

}
