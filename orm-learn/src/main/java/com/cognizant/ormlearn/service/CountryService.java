package com.cognizant.ormlearn.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;

	public List<Country> getAllCountries() {
		List<Country> result = countryRepository.findAll();
		return result;

	}

	@Transactional
	public Country findCountryByCode(String contryCode) throws CountryNotFoundException {
		Optional<Country> result = countryRepository.findById(contryCode);

		if (!result.isPresent()) {
			throw new CountryNotFoundException();
		}
		Country country = result.get();

		return country;

	}

	@Transactional
	public void addCountry(Country country) {
		countryRepository.save(country);
	}

	@Transactional
	public void updateCountry(String code, String name) {
		Optional<Country> country = countryRepository.findById(code);

		Country country2 = country.get();

		country2.setC_name(name);

		countryRepository.save(country2);

	}

	@Transactional
	public void deleteCountry(String code) {
		countryRepository.deleteById(code);
	}

}
