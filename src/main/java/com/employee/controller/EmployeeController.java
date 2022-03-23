package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// api for adding employees
	@PostMapping("/addEmployee")
	public Long addEmployee(@Validated  @RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return employee.getId();
	}

	// Retrieves all employees
	@GetMapping("/getEmployees")
	public List<Employee> getEmployee() {
		return employeeService.getAllEmployee();
	}

	// api for update an Employee
	@PutMapping("/updateEmployee")
	private Employee updateEmployee(@RequestBody Employee employee ) {
		employeeService.saveEmployee(employee);
		return employee;
	}

	// Retrieve the specific details of employee
	@GetMapping("/getEmployee/{id}")
	private Employee getEmployee(@PathVariable("id") Long id) {
		return employeeService.getEmployeeById(id);
	}

	// delete mapping that deletes a specific employee
	@DeleteMapping("/deleteEmployee/{id}")
	private void deleteEmployee(@PathVariable("id") Long id) {
		employeeService.deleteEmployeeById(id);
	}

}
