package com.finzly.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.entity.Country;
import com.finzly.entity.Employee;
import com.finzly.exception.ResourceNotFoundException;
import com.finzly.repository.CountryRepo;
import com.finzly.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{
	
	@Autowired
	private CountryRepo countryRepo;

	@Override
	public Country saveCountry(Country country) {
		Country savedCountry = this.countryRepo.save(country);
		return savedCountry;
	}

	@Override
	public Country updateCountry(Country country) {
		
	
		Country existedCountry = this.countryRepo.findById(country.getCid()).orElseThrow(()->new ResourceNotFoundException("Country not found with this id :"+country.getCid()));
		
		Country updatedCountry = this.countryRepo.save(country);
		return updatedCountry;
	}

	@Override
	public Country deleteCountry(Integer countryId) {
		Country deletedCountry = this.countryRepo.findById(countryId).orElseThrow(()->new ResourceNotFoundException("Country not found with this id :"+countryId));
		return deletedCountry;
	}

	@Override
	public List<Country> getAllCountries() {
		
		List<Country> countries = this.countryRepo.findAll();
		return countries;
	}

		

}
