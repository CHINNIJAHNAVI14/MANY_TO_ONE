package com.hibernate.many_to_one_mapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.many_to_one_mapping.entity.Employee;
import com.hibernate.many_to_one_mapping.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAll()
	{
		List<Employee> empl = new ArrayList<>();
		employeeRepository.findAll().forEach(empl::add);
		return empl;
	}	 
	
	public void save(Employee employee)
	{
		employeeRepository.save(employee);
	}

}
