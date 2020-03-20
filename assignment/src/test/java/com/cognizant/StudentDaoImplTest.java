package com.cognizant;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cognizant.dao.StudentDaoImpl;
import com.cognizant.model.Student;

public class StudentDaoImplTest {

	ApplicationContext factory = new AnnotationConfigApplicationContext(com.cognizant.config.ServiceConfig.class);

	StudentDaoImpl st = factory.getBean(StudentDaoImpl.class);

	Student s = new Student(20, "pushpendu", 78.84);

	@Test
	public void testInsert() {
		// System.out.println(st.insert(s));
		assertTrue(st.insert(s));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetAll() {

		List<Student> all = st.getAll();

		for (Student student : all) {
			assertEquals(20, student.getId());
			assertEquals("pushpendu", student.getName());
			assertEquals(78.74, student.getMarks());

		}

	}

}
