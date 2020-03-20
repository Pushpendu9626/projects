package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cognizant.model.Student;

@Component
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public boolean insert(Student s) {

		String sql = "insert into Student values(?,?,?)";
		int result = jt.update(sql, s.getId(), s.getName(), s.getMarks());
		if(result>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public List<Student> getAll() {
		String sql = "select * from Student";
		StudentRowMapper rw = new StudentRowMapper();
		List<Student> result = jt.query(sql, rw);
		return result;

	}

}
