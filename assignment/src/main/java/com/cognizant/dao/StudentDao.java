package com.cognizant.dao;

import java.util.List;

import com.cognizant.model.Student;

public interface StudentDao {
	public boolean insert(Student s);

	public List<Student> getAll();
}
