package com.cognizant.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cognizant.dao.StudentDaoImpl;

@Configuration
public class ServiceConfig {

	@Bean
	public DriverManagerDataSource dataSource() {

		DriverManagerDataSource db = new DriverManagerDataSource();
		db.setDriverClassName("com.mysql.jdbc.Driver");
		db.setUrl("jdbc:mysql://localhost:3306/mydb");
		db.setUsername("root");
		db.setPassword("Pushpendu@0408");
		return db;
	}
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jt = new JdbcTemplate(dataSource());
		return jt;
	}
	@Bean
	public StudentDaoImpl stdaoimpl()
	{
		return new StudentDaoImpl();
	}

}
