package com.employee.service;

import java.util.List;


import com.employee.model.Employee;
public interface EmployeeService {
	
	Employee  saveEmployee(Employee employee);
	
	List<Employee> getAllEmployee();
	
	void updateEmployee(Employee employee, Long id);

	Employee getEmployeeById(Long id);

	void  deleteEmployeeById(Long id);
	
	

	
	
	
	

}
