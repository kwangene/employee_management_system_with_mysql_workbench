package com.examplethree.springboot_backend.controller;

import com.examplethree.springboot_backend.exception.ResourceNotFoundException;
import com.examplethree.springboot_backend.model.Employee;
import com.examplethree.springboot_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()->new  ResourceNotFoundException("Employee not exist with " +id));
        return ResponseEntity.ok(employee);
    }
  @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @PutMapping("/update/{id}")
    public  Employee updateEmployee(@RequestBody Employee employee,@PathVariable int id){
          Employee existingEmployee = employeeRepository.findById(id).orElse(null);
            existingEmployee.setFirstName(employee.getFirstName());
            existingEmployee.setLastName(employee.getLastName());
            existingEmployee.setEmailId(employee.getEmailId());
            return  employeeRepository.save(existingEmployee);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
         employeeRepository.deleteById(id);
         return "This Employee with Id removed " +id;
    }






}
