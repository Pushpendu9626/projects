package com.cognizant.springLearn.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springLearn.Department;

@Repository
public class DepartmentDao {

	@SuppressWarnings("unused")
	private static ArrayList<Department> DEPARTMETN_LIST;

	@SuppressWarnings("unchecked")
	public DepartmentDao() {
		super();
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		DEPARTMETN_LIST = context.getBean("departmentList", java.util.ArrayList.class);
	}

	public ArrayList<Department> getAllDepartment() {
		return DEPARTMETN_LIST;
	}

}
