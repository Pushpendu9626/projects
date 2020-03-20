package com.cognizant.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cognizant.dao.StudentDaoImpl;
import com.cognizant.model.Student;

public class MainApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext factory = new AnnotationConfigApplicationContext(com.cognizant.config.ServiceConfig.class);

		StudentDaoImpl st = factory.getBean(StudentDaoImpl.class);

		// Student s = new Student(20, "Pushpendu", 98.65);
		// Student s2 = new Student(17, "varun", 99.65);

		// int row = st.insert(s2);

		// System.out.println("Rows affected"+row);

		List<Student> all = st.getAll();
		for (Student student : all) {
			System.out.println(student);

		}
	}

}
