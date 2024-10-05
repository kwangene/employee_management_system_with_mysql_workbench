package com.examplethree.springboot_backend;

import com.examplethree.springboot_backend.model.Employee;
import com.examplethree.springboot_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Kwang");
//		employee.setLastName("Berlina");
//		employee.setEmailId("Oneone.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Paris");
//		employee1.setLastName("RoMa");
//		employee1.setEmailId("london@gmail.com");
//		employeeRepository.save(employee1);
//
//		Employee employee2 = new Employee();
//		employee2.setFirstName("New York");
//		employee2.setLastName("Indiana");
//		employee2.setEmailId("Adam@hotmail.com");
//		employeeRepository.save(employee2);
	}
}
