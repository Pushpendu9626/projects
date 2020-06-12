package com.cognizant.springLearn;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.cognizant.springLearn.controller.CountryController;

@SpringBootTest
public class SpringLearnApplicationTests {

	@Autowired
	private CountryController countryController;
	@Autowired
	private MockMvc mvc;

	@Test
	public void contextLoads() {

		assertNotNull(countryController);
	}

	@Test
	public void testGetCountry() throws Exception {
		ResultActions actions = mvc.perform(get("/country"));
		actions.andExpect(status().isOk());
	}

	@Test
	public void getCountry() throws Exception {
		ResultActions actions = mvc.perform(get("/country"));
		actions.andExpect(status().isOk());
		actions.andExpect(jsonPath("$.code").exists());
		actions.andExpect(jsonPath("$.code").value("IN"));
		actions.andExpect(jsonPath("$.name").value("India"));
	}

	@Test
	public void testGetCountryException() throws Exception {
		ResultActions actions = mvc.perform(get("/countries/UK"));
		actions.andExpect(status().isNotFound());
		actions.andExpect(status().reason("Country Not found"));
	}

}
