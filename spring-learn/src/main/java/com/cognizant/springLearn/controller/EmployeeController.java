package com.cognizant.springLearn.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springLearn.Employee;
import com.cognizant.springLearn.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployee();
	}

	@PutMapping()
	public void updateEmployee(@RequestBody @Valid Employee employee) {
		LOGGER.info("Start");
		employeeService.updateEmployee(employee);
		LOGGER.debug("Employee:{}", employee);
		LOGGER.info("End");
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id) {
		LOGGER.info("Start");
		employeeService.deleteEmployee(id);
		LOGGER.debug("Employee List After Deletions:{}", employeeService.getAllEmployee());
		LOGGER.info("End");
	}

}
