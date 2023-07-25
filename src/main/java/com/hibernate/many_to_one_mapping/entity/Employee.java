package com.hibernate.many_to_one_mapping.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employe")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="dept_id",referencedColumnName = "id")
	private Departmant department;
	
	
	public Employee()
	{

	}

	public Employee(int id, String name, Departmant department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Departmant getDepartment() {
		return department;
	}

	public void setDepartment(Departmant department) {
		this.department = department;
	}
	
	
	
	

}
