package com.hibernate.many_to_one_mapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.many_to_one_mapping.entity.Departmant;
import com.hibernate.many_to_one_mapping.repository.DepartmentRepository;

@Service
public class DepartmentService 
{
	@Autowired
	private DepartmentRepository departmentRepository;
	

	public List<Departmant> getAll()
	{
		List<Departmant> dept = new ArrayList<>();
		departmentRepository.findAll().forEach(dept::add);
		return dept;
	}	 
	
	public void save(Departmant department)
	{
		departmentRepository.save(department);
	}

}
