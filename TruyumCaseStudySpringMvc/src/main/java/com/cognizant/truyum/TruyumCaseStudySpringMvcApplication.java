package com.cognizant.truyum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cognizant.truyum.Controller")
@ComponentScan(" com.cognizant.truyum.Dao")
@ComponentScan("com.cognizant.truyum.model")
@ComponentScan("com.cognizant.truyum.Service")

public class TruyumCaseStudySpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruyumCaseStudySpringMvcApplication.class, args);
	}

}
