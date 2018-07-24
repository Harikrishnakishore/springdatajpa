package com.example.spring.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.spring.data.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
