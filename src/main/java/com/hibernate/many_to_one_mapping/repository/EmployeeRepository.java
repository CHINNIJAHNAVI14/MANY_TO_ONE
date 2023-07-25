package com.hibernate.many_to_one_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.many_to_one_mapping.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
