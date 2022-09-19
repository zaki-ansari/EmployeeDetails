package com.finzly.service;

import java.util.List;

import com.finzly.entity.Country;

public interface CountryService {

	public Country saveCountry(Country country);
	
	public Country updateCountry(Country country);
	
	public Country deleteCountry(Integer countryId);
	
	public List<Country> getAllCountries();
}
