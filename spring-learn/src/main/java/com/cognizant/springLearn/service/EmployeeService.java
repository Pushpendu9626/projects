package com.cognizant.springLearn.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springLearn.Employee;
import com.cognizant.springLearn.dao.EmployeeDao;
import com.cognizant.springLearn.service.exception.EmployeeNotFoundException;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	public ArrayList<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
	public void updateEmployee(Employee employee) {
		try {
			employeeDao.updateEmployee(employee);
		} catch (EmployeeNotFoundException e) {

			e.printStackTrace();
		}
	}

	public void deleteEmployee(int id) {
		try {
			employeeDao.deleteEmployee(id);
		} catch (EmployeeNotFoundException e) {

			e.printStackTrace();
		}

	}
}
