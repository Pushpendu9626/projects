package com.cognizant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.cognizant.model.Student;

public class StudentRowMapper implements org.springframework.jdbc.core.RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student s = new Student();

		s.setId(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setMarks(rs.getDouble(3));

		return s;

	}

}
