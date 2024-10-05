package com.examplethree.springboot_backend.repository;

import com.examplethree.springboot_backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
