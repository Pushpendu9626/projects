package com.cognizant.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.cognizant.springboot.controller")
@ComponentScan(" com.cognizant.springboot.dao.impl")
@ComponentScan("com.cognizant.springboot.model")
@ComponentScan("com.cognizant.sprinigboot.service")
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
