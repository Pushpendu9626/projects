package com.cognizant.springLearn.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springLearn.Department;
import com.cognizant.springLearn.dao.DepartmentDao;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;

	@Transactional
	public ArrayList<Department> getAllDepartment() {
		return departmentDao.getAllDepartment();
	}
}
