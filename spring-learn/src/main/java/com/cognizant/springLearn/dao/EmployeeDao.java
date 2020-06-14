package com.cognizant.springLearn.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springLearn.Employee;
import com.cognizant.springLearn.controller.EmployeeController;
import com.cognizant.springLearn.service.exception.EmployeeNotFoundException;

@Repository
public class EmployeeDao {

	@SuppressWarnings("unused")
	private static ArrayList<Employee> EMPLOYEE_LIST;
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	@SuppressWarnings("unchecked")
	public EmployeeDao() {
		super();

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EMPLOYEE_LIST = context.getBean("employeeList", java.util.ArrayList.class);
	}

	public ArrayList<Employee> getAllEmployee() {
		return EMPLOYEE_LIST;
	}

	public void updateEmployee(Employee employee) throws EmployeeNotFoundException {
		LOGGER.info("Start");
		Employee employeeRequired = null;
		employeeRequired = getEmployeeById(employee.getId());
		if (employeeRequired == null) {
			throw new EmployeeNotFoundException("EmployeeNotFound");
		}
		employeeRequired.setId(employee.getId());
		employeeRequired.setName(employee.getName());

		LOGGER.debug("Employee Updated:{}", employee);
		LOGGER.info("End");
	}

	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		LOGGER.info("Start");
		Employee employee = null;
		employee = getEmployeeById(id);
		if (employee == null) {
			throw new EmployeeNotFoundException("EmployeeNotFound");

		}
		EMPLOYEE_LIST.remove(employee);
		LOGGER.info("End");
	}

	public Employee getEmployeeById(int id) {
		Employee employee = null;
		for (Employee employeeIterator : EMPLOYEE_LIST) {

			if (employeeIterator.getId() == id) {
				employee = employeeIterator;

			}

		}
		return employee;
	}
}
