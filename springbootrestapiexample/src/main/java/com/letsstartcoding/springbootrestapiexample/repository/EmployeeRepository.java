package com.letsstartcoding.springbootrestapiexample.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.letsstartcoding.springbootrestapiexample.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
