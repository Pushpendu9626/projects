package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	private static CountryService countryService;

	/*
	 * private static void testGetAllCountries() { LOGGER.info("start");
	 * List<Country> countries = countryService.getAllCountries();
	 * LOGGER.debug("countries={}", countries); LOGGER.info("End"); }
	 */

	/*
	 * private static void getAllCountriesTest() { LOGGER.info("Start"); Country
	 * country; try { country = countryService.findCountryByCode("IN");
	 * LOGGER.debug("Country:{}", country); } catch (CountryNotFoundException e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * LOGGER.info("End");
	 * 
	 * }
	 */

	/*
	 * private static void testAddCountry() { LOGGER.info("Start"); Country country
	 * = new Country(); country.setC_code("QA"); country.setC_name("quaet"); Country
	 * country1; countryService.addCountry(country); try { country1 =
	 * countryService.findCountryByCode("QA"); LOGGER.debug("Country:{}", country1);
	 * } catch (CountryNotFoundException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } LOGGER.info("End");
	 * 
	 * }
	 */
	/*
	 * private static void updateCountries() { LOGGER.info("start");
	 * countryService.updateCountry("IN", "IRAN"); LOGGER.info("End"); }
	 */

	private static void deleteCountries() {
		LOGGER.info("start");
		countryService.deleteCountry("QA");
		LOGGER.info("End");
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		// testGetAllCountries();
		// getAllCountriesTest();
		// testAddCountry();
		// updateCountries();
		deleteCountries();

	}

}
