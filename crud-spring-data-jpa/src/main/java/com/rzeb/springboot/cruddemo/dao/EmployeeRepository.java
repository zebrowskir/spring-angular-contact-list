package com.rzeb.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rzeb.springboot.cruddemo.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {	
}
