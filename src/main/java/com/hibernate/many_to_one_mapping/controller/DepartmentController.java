package com.hibernate.many_to_one_mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.many_to_one_mapping.entity.Departmant;
import com.hibernate.many_to_one_mapping.service.DepartmentService;

@RestController
@RequestMapping("/api/dept")
public class DepartmentController 
{
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping
	public void createQuestion(@RequestBody Departmant depatment)
	{
		departmentService.save(depatment);
	}
	
	@GetMapping
	public List<Departmant> getAllUser()
	{
		return departmentService.getAll();
	}

}
